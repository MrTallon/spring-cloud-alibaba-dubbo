package com.tallon.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 个人信息参数
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 16:19
 */
@Data
public class ProfileParam implements Serializable {

    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像
     */
    private String icon;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 备注
     */
    private String note;

    /**
     * 用户状态 {@code Integer}
     * <p>
     * 0 - 禁止 <br />
     * 1 - 启用
     * </p>
     */
    private Integer status;
}
