package com.reg.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 加密服务
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 15:17
 */
@Configuration
public class UmsAdminResourceConfiguration {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

