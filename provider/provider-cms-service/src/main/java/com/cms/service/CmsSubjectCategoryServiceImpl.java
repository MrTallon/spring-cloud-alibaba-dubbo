package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsSubjectCategoryService;
import com.cms.domain.CmsSubjectCategory;
import com.cms.mapper.CmsSubjectCategoryMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 专题分类表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsSubjectCategoryServiceImpl extends ServiceImpl<CmsSubjectCategoryMapper, CmsSubjectCategory> implements CmsSubjectCategoryService {

}
