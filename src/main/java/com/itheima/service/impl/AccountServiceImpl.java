package com.itheima.service.impl;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("/accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("findAll...业务层");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
