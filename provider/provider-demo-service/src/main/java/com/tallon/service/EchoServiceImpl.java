package com.tallon.service;

import com.tallon.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 测试连接
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-26 20:37
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        return "Hello Dubbo, " + message;
    }
}
