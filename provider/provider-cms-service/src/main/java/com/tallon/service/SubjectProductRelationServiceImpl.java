package com.tallon.service;

import com.tallon.domain.SubjectProductRelation;
import com.tallon.mapper.SubjectProductRelationMapper;
import com.tallon.api.SubjectProductRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 专题商品关系表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class SubjectProductRelationServiceImpl extends ServiceImpl<SubjectProductRelationMapper, SubjectProductRelation> implements SubjectProductRelationService {

}
