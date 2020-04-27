package com.tallon.mapper;

import com.tallon.domain.Book;
import com.tallon.domain.Store;
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
    private BookMapper bookMapper;

    @Resource
    private StoreMapper storeMapper;

    @Test
    public void testBookMapper() {

        List<Book> books = bookMapper.selectList(null);
        books.forEach(System.out::println);
    }

    @Test
    public void testStoreMapper() {

        List<Store> books = storeMapper.selectList(null);
        books.forEach(System.out::println);
    }
}
