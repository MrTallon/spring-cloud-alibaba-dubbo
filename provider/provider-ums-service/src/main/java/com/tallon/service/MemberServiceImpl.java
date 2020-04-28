package com.tallon.service;

import com.tallon.domain.Member;
import com.tallon.mapper.MemberMapper;
import api.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
