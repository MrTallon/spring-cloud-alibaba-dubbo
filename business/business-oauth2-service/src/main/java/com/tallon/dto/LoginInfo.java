package com.tallon.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录信息
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 11:40
 */
@Data
public class LoginInfo implements Serializable {
    private String name;
    private String avatar;
    private String nickName;
}
