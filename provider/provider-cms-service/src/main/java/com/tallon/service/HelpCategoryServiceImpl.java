package com.tallon.service;

import com.tallon.domain.HelpCategory;
import com.tallon.mapper.HelpCategoryMapper;
import com.tallon.api.HelpCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 帮助分类表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class HelpCategoryServiceImpl extends ServiceImpl<HelpCategoryMapper, HelpCategory> implements HelpCategoryService {

}
