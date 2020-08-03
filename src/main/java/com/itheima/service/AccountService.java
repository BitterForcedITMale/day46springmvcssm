package com.itheima.service;

import com.itheima.bean.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    void save(Account account);
}
