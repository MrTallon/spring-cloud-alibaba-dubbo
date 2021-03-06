package com.ums.api;

import com.ums.domain.UmsAdmin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
public interface UmsAdminService extends IService<UmsAdmin> {

    /**
     * 通过用户名获取数据
     * @param username 用户名
     * @return {@link UmsAdmin}
     */
    UmsAdmin getByName(String username);

    /**
     * 根据用户名修改密码
     * @param username 用户名
     * @param newPassword 密码
     * @return 修改结果
     */
    boolean modifyPassword(String username, String newPassword);

    /**
     * 根据用户名修改头像
     * @param username 用户名
     * @param path 头像
     * @return 修改结果
     */
    boolean modifyIcon(String username, String path);
}
