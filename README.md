# Spring Cloud Alibaba Dubbo

基于 Spring Cloud Alibaba Dubbo，  
实现对内 RPC、对外 REST 接口的脚手架

集成 MybatisPlus、Redis、RocketMQ 等常用中间件

实现 oAuth2 协议的 SpringSecurity 登录功能

添加 Docker 插件，实现各模块快速部署

为以后开发提供丰富扩展性

## 开发日记：

2020.4.25  
初始化项目目录结构

2020.4.26  
计划将 provider 中的 api 和 service 服务进行合并
日后开发仅以服务内容进行分项目，不再细分到接口和实现类。  
再三思考，还是需要将 api 和 service 进行分割，这样才能实现rest接口不直接调用数据库的操作

2020.4.28  
在思考如何划分微服务模块时，本来想按功能划分，但是存在功能间调用混乱的问题，边界越来越模糊。  
最后考虑用数据库来划分，生产环境数据库是分库形式，依据不同功能就库进行拆分，开发模块依照同等要求拆分。  
这样每个模块配置各自的数据源，相应的也避免了多源问题




















