package com.lks.springbootdemo01;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lks.springbootdemo01.bean.Book;
import com.lks.springbootdemo01.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    BookDao bookDao;

    @Test
    public void getBookById(){
        Book book = bookDao.selectById(1);
        System.out.println(book);
    }

    @Test
    public void testGetPage(){
        IPage page = new Page(2, 5); // 两个参数，一个为当前的页码，另一个为每页的记录数
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());		//当前页码值
        System.out.println(page.getSize());			//每页显示数
        System.out.println(page.getTotal());		//数据总量
        System.out.println(page.getPages());		//总页数
        System.out.println(page.getRecords());		//详细数据
        System.out.println(page.getRecords().size());		//详细数据记录数
    }
    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");// 第一个参数为数据库列名，第二个则是查询条件，即 where name like %Spring%
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = "Spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        //if(name != null) lqw.like(Book::getName,name);		//方式一：JAVA代码控制
        lqw.like(name != null,Book::getName,name);				//方式二：API接口提供控制开关
        bookDao.selectList(lqw);
    }

}
