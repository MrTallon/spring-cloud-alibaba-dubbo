package com.tallon.service;

import com.tallon.domain.SubjectCategory;
import com.tallon.mapper.SubjectCategoryMapper;
import com.tallon.api.SubjectCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 专题分类表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service
public class SubjectCategoryServiceImpl extends ServiceImpl<SubjectCategoryMapper, SubjectCategory> implements SubjectCategoryService {

}
