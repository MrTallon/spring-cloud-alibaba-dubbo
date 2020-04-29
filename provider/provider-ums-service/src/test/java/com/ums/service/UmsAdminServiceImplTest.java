package com.ums.service;

import com.ums.api.UmsAdminService;
import com.ums.domain.UmsAdmin;
import com.ums.mapper.UmsAdminMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UmsAdminServiceImplTest{
    @Resource
    private UmsAdminMapper mapper;

    @Resource
    private UmsAdminService service;

    @Test
    public void testGetByName() {
        UmsAdmin admin = service.getByName("admin");
        Assert.assertNotNull(admin);
    }

}
