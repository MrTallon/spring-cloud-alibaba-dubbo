package com.tallon.service;

import com.tallon.domain.AdminRoleRelation;
import com.tallon.mapper.AdminRoleRelationMapper;
import api.AdminRoleRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户和角色关系表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class AdminRoleRelationServiceImpl extends ServiceImpl<AdminRoleRelationMapper, AdminRoleRelation> implements AdminRoleRelationService {

}
