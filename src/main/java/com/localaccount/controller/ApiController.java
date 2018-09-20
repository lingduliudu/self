package com.localaccount.controller;


import java.util.List;

import org.mockito.internal.util.collections.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.localaccount.model.Account;
import com.localaccount.repository.AccountRepository;
import com.localaccount.response.ResponseInfo;
import com.localaccount.service.IAccountService;

/**
 * Created by zhangh-ag on 2017-06-12.
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private IAccountService accountService;
    
    /**
     * 查询一个账号
     */
    @PostMapping(value = "/queryAccount",produces= {"application/json;charset=UTF-8"})
    public String queryAccount(String accountNo) {
    	ResponseInfo rInfo = new ResponseInfo();
    	rInfo.setResponseCode(0);
    	rInfo.setInfo("操作成功!");
    	try {
    		//做一次同步
    		//做一次查询
    		List<Account> accountList =  accountService.queryByAccountNo(accountNo);
    		rInfo.setData(JSON.toJSONString(accountList));
    		rInfo.doSuccess();
    	} catch(Exception e) {
    		e.printStackTrace();
        	rInfo.setInfo("操作异常!");
    		return rInfo.toString();
    	}
    	return rInfo.toString();
    }


}