package com.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * reg启动类
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 15:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessRegApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessRegApplication.class, args);
    }
}
