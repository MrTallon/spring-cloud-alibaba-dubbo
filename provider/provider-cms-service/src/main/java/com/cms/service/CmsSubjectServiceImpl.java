package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsSubjectService;
import com.cms.domain.CmsSubject;
import com.cms.mapper.CmsSubjectMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 专题表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsSubjectServiceImpl extends ServiceImpl<CmsSubjectMapper, CmsSubject> implements CmsSubjectService {

}
