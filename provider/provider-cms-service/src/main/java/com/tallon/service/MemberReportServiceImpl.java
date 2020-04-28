package com.tallon.service;

import com.tallon.domain.MemberReport;
import com.tallon.mapper.MemberReportMapper;
import com.tallon.api.MemberReportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户举报表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service
public class MemberReportServiceImpl extends ServiceImpl<MemberReportMapper, MemberReport> implements MemberReportService {

}
