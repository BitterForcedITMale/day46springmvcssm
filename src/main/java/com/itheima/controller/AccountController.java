package com.itheima.controller;


import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        System.out.println("findAll....哈哈");
        ModelAndView modelAndView = new ModelAndView();
        List<Account> accounts =  accountService.findAll();
        System.out.println("accounts--->"+accounts);
        modelAndView.addObject("accounts", accounts);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Account account){
        // 保存账户信息
        System.out.println("account-->" + account);
        accountService.save(account);
        return "redirect:findAll";
    }
}
