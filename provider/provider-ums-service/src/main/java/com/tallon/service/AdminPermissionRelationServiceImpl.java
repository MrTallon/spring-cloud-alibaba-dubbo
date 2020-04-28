package com.tallon.service;

import com.tallon.domain.AdminPermissionRelation;
import com.tallon.mapper.AdminPermissionRelationMapper;
import api.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements AdminPermissionRelationService {

}
