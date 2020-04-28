package com.tallon.service;

import com.tallon.domain.PrefrenceAreaProductRelation;
import com.tallon.mapper.PrefrenceAreaProductRelationMapper;
import com.tallon.api.PrefrenceAreaProductRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 优选专区和产品关系表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class PrefrenceAreaProductRelationServiceImpl extends ServiceImpl<PrefrenceAreaProductRelationMapper, PrefrenceAreaProductRelation> implements PrefrenceAreaProductRelationService {

}
