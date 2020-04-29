package com.tallon.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改头像参数
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 16:27
 */
@Data
public class IconParam implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像地址
     */
    private String path;

}
