package com.itheima.dao;

import com.itheima.bean.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    List<Account> findAll();

    void save(Account account);
//    void save(Account account);
}
