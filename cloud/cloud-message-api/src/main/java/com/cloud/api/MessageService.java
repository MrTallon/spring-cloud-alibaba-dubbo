package com.cloud.api;

import com.cloud.dto.UmsAdminLoginLogDTO;

/**
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 16:05
 */
public interface MessageService {

    /**
     * 日志
     * @param umsAdminLoginLogDTO {@link UmsAdminLoginLogDTO}
     * @return 发送状态
     */
    boolean sendAdminLoginLog(UmsAdminLoginLogDTO umsAdminLoginLogDTO);

}