package com.localaccount.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localaccount.IDAO.IBaseDao;
import com.localaccount.model.Account;
import com.localaccount.repository.AccountRepository;
import com.localaccount.service.IAccountService;

/**
 * Created by zhangh-ag on 2017-06-12.
 */
@Service
public class AccountServiceImpl implements IAccountService{

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private IBaseDao baseDao;

    @Override
    public List<Account> queryByAccountNo(String accountNo) {
    	List<Account> list =  accountRepository.findByAccountNo(accountNo);
    	return list;
    }
}