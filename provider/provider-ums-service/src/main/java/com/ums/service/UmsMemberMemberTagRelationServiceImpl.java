package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberMemberTagRelationService;
import com.ums.domain.UmsMemberMemberTagRelation;
import com.ums.mapper.UmsMemberMemberTagRelationMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 用户和标签关系表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberMemberTagRelationServiceImpl extends ServiceImpl<UmsMemberMemberTagRelationMapper, UmsMemberMemberTagRelation> implements UmsMemberMemberTagRelationService {

}
