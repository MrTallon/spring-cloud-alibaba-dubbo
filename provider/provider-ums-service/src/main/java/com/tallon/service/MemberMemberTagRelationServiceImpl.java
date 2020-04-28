package com.tallon.service;

import com.tallon.domain.MemberMemberTagRelation;
import com.tallon.mapper.MemberMemberTagRelationMapper;
import api.MemberMemberTagRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 用户和标签关系表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationMapper, MemberMemberTagRelation> implements MemberMemberTagRelationService {

}
