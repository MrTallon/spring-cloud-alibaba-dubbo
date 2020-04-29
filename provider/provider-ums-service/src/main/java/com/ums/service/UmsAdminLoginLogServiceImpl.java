package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsAdminLoginLogService;
import com.ums.domain.UmsAdminLoginLog;
import com.ums.mapper.UmsAdminLoginLogMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsAdminLoginLogServiceImpl extends ServiceImpl<UmsAdminLoginLogMapper, UmsAdminLoginLog> implements UmsAdminLoginLogService {

}
