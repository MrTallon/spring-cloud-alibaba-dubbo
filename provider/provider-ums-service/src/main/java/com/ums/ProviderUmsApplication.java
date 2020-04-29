package com.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ums启动类
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-28 10:29
 */
@SpringBootApplication
@MapperScan("com.ums.mapper")
public class ProviderUmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUmsApplication.class, args);
    }
}
