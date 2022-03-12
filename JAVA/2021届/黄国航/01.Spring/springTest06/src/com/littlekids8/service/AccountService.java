package com.littlekids8.service;

import com.littlekids8.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class AccountService {
    // 注入dao
    @Autowired
    private AccountDao accountDao;

    // 转账的方法
    public void transferMoney(){

            // lucy少100
            accountDao.reduceMoney();
            // 模拟异常
            //int i = 10/0;

            // marry多一百
            accountDao.addMoney();



    }
}
