package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsHelpService;
import com.cms.domain.CmsHelp;
import com.cms.mapper.CmsHelpMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 帮助表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsHelpServiceImpl extends ServiceImpl<CmsHelpMapper, CmsHelp> implements CmsHelpService {

}
