package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsHelpCategoryService;
import com.cms.domain.CmsHelpCategory;
import com.cms.mapper.CmsHelpCategoryMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 帮助分类表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsHelpCategoryServiceImpl extends ServiceImpl<CmsHelpCategoryMapper, CmsHelpCategory> implements CmsHelpCategoryService {

}
