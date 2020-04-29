package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsTopicCategoryService;
import com.cms.domain.CmsTopicCategory;
import com.cms.mapper.CmsTopicCategoryMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 话题分类表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsTopicCategoryServiceImpl extends ServiceImpl<CmsTopicCategoryMapper, CmsTopicCategory> implements CmsTopicCategoryService {

}
