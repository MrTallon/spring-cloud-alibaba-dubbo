package com.tallon.api;

/**
 * 测试连接
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-26 20:36
 */
public interface EchoService {
    /**
     * 测试连接
     * @param message
     * @return
     */
    String echo(String message);
}
