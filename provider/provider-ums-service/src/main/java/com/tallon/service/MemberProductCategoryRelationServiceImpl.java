package com.tallon.service;

import com.tallon.domain.MemberProductCategoryRelation;
import com.tallon.mapper.MemberProductCategoryRelationMapper;
import api.MemberProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationMapper, MemberProductCategoryRelation> implements MemberProductCategoryRelationService {

}
