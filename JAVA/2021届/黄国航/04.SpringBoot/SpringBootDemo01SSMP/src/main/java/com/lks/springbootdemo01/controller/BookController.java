package com.lks.springbootdemo01.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lks.springbootdemo01.bean.Book;
import com.lks.springbootdemo01.bean.R;
import com.lks.springbootdemo01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true, bookService.getAll() );
    }

    @PostMapping
    public R save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new R(flag);
    }

    @PutMapping
    public R update(@RequestBody Book book){

        return new R(bookService.update(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id));
    }

    // localhost:8080/books/1
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize, Book book){

        IPage<Book> page = bookService.getPage(currentPage, pageSize, book);
        //如果当前页码值大于了总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if( currentPage > page.getPages()){
            page = bookService.getPage((int)page.getPages(), pageSize,book);
        }
        return new R(true, page);
    }

}
