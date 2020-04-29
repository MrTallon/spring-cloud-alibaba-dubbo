package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsTopicCommentService;
import com.cms.domain.CmsTopicComment;
import com.cms.mapper.CmsTopicCommentMapper;
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
public class CmsTopicCommentServiceImpl extends ServiceImpl<CmsTopicCommentMapper, CmsTopicComment> implements CmsTopicCommentService {

}
