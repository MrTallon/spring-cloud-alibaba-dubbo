package com.tallon.controller;

import com.tallon.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试连接
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-26 21:45
 */
@RestController
@RequestMapping(value = "echo")
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService service;

    @GetMapping(value = "{message}")
    public String echo(@PathVariable String message) {
        return service.echo(message);
    }
}
