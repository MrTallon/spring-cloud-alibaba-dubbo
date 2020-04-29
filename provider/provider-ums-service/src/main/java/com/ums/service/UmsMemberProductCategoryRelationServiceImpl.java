package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberProductCategoryRelationService;
import com.ums.domain.UmsMemberProductCategoryRelation;
import com.ums.mapper.UmsMemberProductCategoryRelationMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberProductCategoryRelationServiceImpl extends ServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation> implements UmsMemberProductCategoryRelationService {

}
