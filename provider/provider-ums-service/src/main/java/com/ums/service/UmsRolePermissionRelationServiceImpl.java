package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsRolePermissionRelationService;
import com.ums.domain.UmsRolePermissionRelation;
import com.ums.mapper.UmsRolePermissionRelationMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户角色和权限关系表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsRolePermissionRelationServiceImpl extends ServiceImpl<UmsRolePermissionRelationMapper, UmsRolePermissionRelation> implements UmsRolePermissionRelationService {

}
