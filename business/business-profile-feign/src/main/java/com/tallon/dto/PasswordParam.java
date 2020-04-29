package com.tallon.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改密码参数
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 16:20
 */
@Data
public class PasswordParam implements Serializable {

    private String username;
    private String oldPassword;
    private String newPassword;

}