package com.lks.springbootdemo01.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lks.springbootdemo01.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
