package com.tallon.service;

import com.tallon.domain.TopicComment;
import com.tallon.mapper.TopicCommentMapper;
import com.tallon.api.TopicCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 专题评论表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service
public class TopicCommentServiceImpl extends ServiceImpl<TopicCommentMapper, TopicComment> implements TopicCommentService {

}
