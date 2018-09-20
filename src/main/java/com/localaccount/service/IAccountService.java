package com.localaccount.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.localaccount.model.Account;

/**
 * 
 */
public interface IAccountService {

    @Transactional
    public  List<Account> queryByAccountNo(String accountNo);

}