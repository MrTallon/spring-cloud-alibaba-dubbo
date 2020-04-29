package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsMemberReportService;
import com.cms.domain.CmsMemberReport;
import com.cms.mapper.CmsMemberReportMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 用户举报表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsMemberReportServiceImpl extends ServiceImpl<CmsMemberReportMapper, CmsMemberReport> implements CmsMemberReportService {

}
