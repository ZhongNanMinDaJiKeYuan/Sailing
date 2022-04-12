package com.lks.springbootdemo01.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lks.springbootdemo01.bean.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(Integer currentPage,Integer pageSize);
    IPage<Book> getPage(Integer currentPage,Integer pageSize,Book queryBook);
}
