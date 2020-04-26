package com.tallon.mapper;

import com.tallon.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMapperTest {

    @Resource
    private DemoMapper mapper;

    @Test
    public void testMapper() {

        List<Book> books = mapper.selectList(null);
        books.forEach(System.out::println);
    }
}
