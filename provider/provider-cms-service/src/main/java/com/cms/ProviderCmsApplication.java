package com.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * cms启动类
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-28 09:55
 */
@SpringBootApplication
@MapperScan("com.cms.mapper")
public class ProviderCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderCmsApplication.class, args);
    }
}
