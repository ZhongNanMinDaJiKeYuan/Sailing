package com.littlekids8.dao;

import com.littlekids8.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    // 注入jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        // sql语句
        String sql = "insert into book values(?,?,?)";

        int update = jdbcTemplate.update(sql, book.getBookId(), book.getBookName(), book.getComment());
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql = "update book set bookname=?, comment=? where book_id=?";
        int update = jdbcTemplate.update(sql, book.getBookName(), book.getComment(), book.getBookId());
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from book where book_id =?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from book where book_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;

    }

    @Override
    public List<Book> findAllBooks() {
        String sql = "select * from book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));

        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
