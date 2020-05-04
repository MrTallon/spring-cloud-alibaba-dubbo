package com.tallon.controller.fallback;

import com.tallon.commons.dto.ResponseResult;
import com.tallon.dto.UmsAdminDTO;
import com.tallon.feign.fallback.ProfileFeignFallback;
import lombok.extern.java.Log;

/**
 * 用户管理服务熔断器
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-30 00:06
 */
@Log
public class ProfileControllerFallback {

    /**
     * 熔断方法
     *
     * @param username {@code String} 用户名
     * @return {@link ResponseResult<UmsAdminDTO>}
     */
    public static ResponseResult<UmsAdminDTO> infoFallback(String username, Throwable ex) {
        log.warning("Invoke infoFallback: " + ex.getClass().getTypeName());
        ex.printStackTrace();
        return new ResponseResult<UmsAdminDTO>(ResponseResult.CodeStatus.BREAKING, ProfileFeignFallback.BREAKING_MESSAGE);
    }

}
