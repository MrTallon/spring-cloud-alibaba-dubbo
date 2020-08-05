# Spring Cloud Alibaba Dubbo

基于 Spring Cloud Alibaba Dubbo，  
实现对内 RPC、对外 REST 接口的脚手架

集成 MybatisPlus、Redis、RocketMQ 等常用中间件

实现 oAuth2 协议的 SpringSecurity 登录功能

添加 Docker 插件，实现各模块快速部署

为以后开发提供丰富扩展性

|  框架    |  完成进度    |   🏷️   |
| ---- | ---- | ---- |
|   Cloud   |  100%    |   ✅   |
|  Dubbo    |   100%   |   ✅   |
|   Nacos   |   100%   |    ✅  |
| MyBatisPlus | 100% | ✅ |
| Security | 50% | 
| sentinel | 0% |
| WebFlux | 0% |
| Redis | 0% |
| RocketMQ | 0% |

 
---

|  模块    |  完成进度    |   🏷️   |
| ---- | ---- | ---- |
|   用户注册   |  100%    |   ✅   |
| 用户登录 | 50% |  |


---

## 开发日记：

2020.4.25  
初始化项目目录结构

2020.4.26  
计划将 provider 中的 api 和 service 服务进行合并，日后开发仅以服务内容进行分模块，不再细分到接口和实现类。  
再三思考，还是需要将 api 和 service 进行分割，这样才能实现rest接口不直接调用数据库的操作

2020.4.28  
在思考如何划分微服务模块时，provider 层本来想按功能划分，但是存在功能间调用混乱的问题，边界越来越模糊。  
最后考虑用数据库来划分，生产环境数据库是分库形式，依据不同用途进行拆分，开发模块依照同等要求拆分。  
这样每个模块配置各自的数据源，相应的也避免了多源问题。  
总结: provider 按照数据库分，business 按照功能分  
开发前本想把表名前缀（ums_）等替换掉，只截取后面的表名，
可是在过程中发现没有表名前缀来区分不是一件好事。

2020.4.29  
事不过三，三则重构；  
每个类只做一种事，每个方法只做一件事；  
开发完一个模块前不要做下一个模块，开发完一个模块后立即重构；  
最小知识原则，里氏替换原则……

这些开发法则真的是要认真遵守，否则即使是微服务也会很快落入单体应用的泥沼

深度实践自己之前的[文章](https://tallon.ink/archives/ed2e9abb.html#more)，  
测试，写代码，重构。几分钟一个循环。  
贯彻极限编程思想

测试先行，方便重构后代码校验

请求RESTful风格的接口，拿回json数据，解析后得到需要的内容，前端取到token，利用令牌获取后台数据，实现认证过程。轻松！

今晚重构：包路径重新命名，解决所有TODO，解决报错，重新整理依赖

2020.4.30  
TiDB 了解一下，金融级高可用 ACID 数据库，安全、效率高，还能当数据仓库用

实现基于token的登录功能，典型的单点登录，无状态应用，万物皆资源，只要有令牌就可以访问  
注销则是删除token

2020.5.3
前后分离 + SpringCloudGateway + Feign + Token  
单点登录，网关路由一条龙

2020.5.4  
Feign 熔断 
三种状态：全开，半开，关闭  
调用 feign 的模块需要开启 sentinel 配置

Dubbo 熔断（配合控制台）  
http://localhost:8080/#/dashboard
```shell script
java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar
```
```shell script
-Djava.net.preferIPv4Stack=true
-Dcsp.sentinel.api.port=8720
-Dproject.name=provider-ums-service
-Dcsp.sentinel.dashboard.server=127.0.0.1:8080
```

最初的设计是在 Feign 客户端做到熔断（服务端停止），实际开发过程中客户端是不会停止的，故要做到在服务提供断做到熔断和限流
熔断：该请求断开返回固定结果  
降级：保证主业务基本可以用，返回一个固定的结果到客户端  
限流：超出的请求数量直接通过降级返回客户端



Maven 有一个小坑，依赖过深的话（3层以上），可能有传递不下来的现象（一定概率上触发），故尽量注意避免

TODO
配置文件上Nacos  
docker-compose -f example/standalone-mysql.yaml up


test



















