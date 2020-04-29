package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsPrefrenceAreaProductRelationService;
import com.cms.domain.CmsPrefrenceAreaProductRelation;
import com.cms.mapper.CmsPrefrenceAreaProductRelationMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 优选专区和产品关系表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsPrefrenceAreaProductRelationServiceImpl extends ServiceImpl<CmsPrefrenceAreaProductRelationMapper, CmsPrefrenceAreaProductRelation> implements CmsPrefrenceAreaProductRelationService {

}
