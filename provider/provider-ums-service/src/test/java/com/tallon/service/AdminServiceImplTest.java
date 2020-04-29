package com.tallon.service;

import com.tallon.api.AdminService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.tallon.domain.Admin;
import com.tallon.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceImplTest {
    @Resource
    private AdminMapper mapper;

    @Resource
    private AdminService service;

    @Test
    public void testDomain() {
        List<Admin> list = new Admin().selectAll();
        list.forEach(System.out::println);
    }

    @Test
    public void testMapper() {
        List<Admin> list = mapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testService() {
//        List<Admin> list = service.list();
//        list.forEach(System.out::println);

        Admin admin = service.getOne(Wrappers.<Admin>lambdaQuery()
                .eq(Admin::getUsername, "admin"));
        System.out.println(admin);

    }
}
