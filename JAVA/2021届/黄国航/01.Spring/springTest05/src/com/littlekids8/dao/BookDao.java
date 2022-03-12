package com.littlekids8.dao;

import com.littlekids8.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBooks();

    void batchAddBook(List<Object[]> batchArgs);
}
