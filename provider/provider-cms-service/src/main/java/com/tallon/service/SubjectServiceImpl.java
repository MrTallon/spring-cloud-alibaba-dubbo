package com.tallon.service;

import com.tallon.domain.Subject;
import com.tallon.mapper.SubjectMapper;
import com.tallon.api.SubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 专题表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

}
