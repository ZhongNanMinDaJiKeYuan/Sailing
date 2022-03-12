package com.littlekids8.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 模拟转账：Lucy给Marry转100块。
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // lucy账户少100；
    @Override
    public void reduceMoney() {
        String sql = "update account set money = money-? where username=?";
        jdbcTemplate.update(sql, 100,"lucy");
    }

    // marry的账户多100
    @Override
    public void addMoney() {
        String sql = "update account set money = money+? where username=?";
        jdbcTemplate.update(sql, 100,"marry");
    }
}
