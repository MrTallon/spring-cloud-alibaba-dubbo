package com.tallon.service;

import com.tallon.domain.TopicCategory;
import com.tallon.mapper.TopicCategoryMapper;
import com.tallon.api.TopicCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 话题分类表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class TopicCategoryServiceImpl extends ServiceImpl<TopicCategoryMapper, TopicCategory> implements TopicCategoryService {

}
