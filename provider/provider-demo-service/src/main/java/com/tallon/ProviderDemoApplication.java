package com.tallon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试启动类
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-26 20:32
 */
@SpringBootApplication
@MapperScan("com.tallon.mapper")
public class ProviderDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoApplication.class, args);
    }
}
