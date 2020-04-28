package com.tallon.service;

import com.tallon.api.HelpCategoryService;
import com.tallon.domain.HelpCategory;
import com.tallon.mapper.HelpCategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelpCategoryServiceImplTest {

    @Resource
    private HelpCategoryMapper mapper;

    @Resource
    private HelpCategoryService service;

    @Test
    public void testDomain() {
        HelpCategory category = new HelpCategory();
        List<HelpCategory> categories = category.selectAll();
        categories.forEach(System.out::println);
    }

    @Test
    public void testMapper() {
        List<HelpCategory> list = mapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testService() {
        List<HelpCategory> list = service.list();
        list.forEach(System.out::println);
    }

}