package com.ums.service.fallback;

import com.ums.domain.UmsAdmin;
import lombok.extern.java.Log;

/**
 * dubbo熔断
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-05-04 11:35
 */
@Log
public class UmsAdminServiceFallback {

    /**
     * 熔断方法
     *
     * @param username {@code String} 用户名
     * @param ex       {@code Throwable} 异常信息
     * @return {@link UmsAdmin} 熔断后的固定结果
     */
    public static UmsAdmin getByUsernameFallback(String username, Throwable ex) {
        log.warning("Invoke getByUsernameFallback: " + ex.getClass().getTypeName());
        ex.printStackTrace();
        return null;
    }
}
