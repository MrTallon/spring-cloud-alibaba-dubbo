package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsPermissionService;
import com.ums.domain.UmsPermission;
import com.ums.mapper.UmsPermissionMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionMapper, UmsPermission> implements UmsPermissionService {

}
