package com.tallon.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录参数
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 11:40
 */
@Data
public class LoginParam implements Serializable {

    private String username;
    private String password;

}
