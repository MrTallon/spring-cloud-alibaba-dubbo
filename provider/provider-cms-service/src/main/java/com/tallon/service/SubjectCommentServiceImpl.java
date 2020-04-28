package com.tallon.service;

import com.tallon.domain.SubjectComment;
import com.tallon.mapper.SubjectCommentMapper;
import com.tallon.api.SubjectCommentService;
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
public class SubjectCommentServiceImpl extends ServiceImpl<SubjectCommentMapper, SubjectComment> implements SubjectCommentService {

}
