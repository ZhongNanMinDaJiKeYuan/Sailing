package com.littlekids8.service;

import com.littlekids8.dao.BookDao;
import com.littlekids8.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    // 注入dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    // 更新数据
    public void updateBook(Book book) {
        bookDao.update(book);
    }
    // 删除数据
    public void deleteBook(Book book) {
        bookDao.delete(book.getBookId());
    }

    // 查询记录数
    public int findCount(){
       return bookDao.selectCount();
    }

    // 查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

    // 查询所有有记录
    public List<Book> findAll(){
        return bookDao.findAllBooks();
    }

    // 批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }


}
