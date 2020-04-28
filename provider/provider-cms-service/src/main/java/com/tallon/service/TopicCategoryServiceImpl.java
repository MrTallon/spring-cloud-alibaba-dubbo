package com.tallon.service;

import com.tallon.domain.TopicCategory;
import com.tallon.mapper.TopicCategoryMapper;
import com.tallon.api.TopicCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题分类表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service
public class TopicCategoryServiceImpl extends ServiceImpl<TopicCategoryMapper, TopicCategory> implements TopicCategoryService {

}
