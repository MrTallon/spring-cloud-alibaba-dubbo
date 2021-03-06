package com.tallon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * oAuth启动类
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 11:33
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BusinessOAuth2Application {
    public static void main(String[] args) {
        SpringApplication.run(BusinessOAuth2Application.class, args);
    }
}
