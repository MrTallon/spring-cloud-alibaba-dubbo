package com.cms.service;

import com.cms.api.CmsHelpCategoryService;
import com.cms.domain.CmsHelpCategory;
import com.cms.mapper.CmsHelpCategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsHelpCategoryServiceImplTest {

    @Resource
    private CmsHelpCategoryMapper mapper;

    @Resource
    private CmsHelpCategoryService service;

    @Test
    public void testDomain() {
        List<CmsHelpCategory> list = new CmsHelpCategory().selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testMapper() {
        List<CmsHelpCategory> list = mapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testService() {
        List<CmsHelpCategory> list = service.list();
        list.forEach(System.out::println);
    }
}
