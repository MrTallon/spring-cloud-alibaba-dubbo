package com.tallon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * profile启动类
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 23:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessProfileApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessProfileApplication.class, args);
    }
}
