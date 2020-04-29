package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsPrefrenceAreaService;
import com.cms.domain.CmsPrefrenceArea;
import com.cms.mapper.CmsPrefrenceAreaMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 优选专区 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsPrefrenceAreaServiceImpl extends ServiceImpl<CmsPrefrenceAreaMapper, CmsPrefrenceArea> implements CmsPrefrenceAreaService {

}
