package com.tallon.service;

import com.tallon.domain.Role;
import com.tallon.mapper.RoleMapper;
import api.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
