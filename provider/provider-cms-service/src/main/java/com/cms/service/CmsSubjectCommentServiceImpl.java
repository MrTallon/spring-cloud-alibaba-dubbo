package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsSubjectCommentService;
import com.cms.domain.CmsSubjectComment;
import com.cms.mapper.CmsSubjectCommentMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 专题评论表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsSubjectCommentServiceImpl extends ServiceImpl<CmsSubjectCommentMapper, CmsSubjectComment> implements CmsSubjectCommentService {

}
