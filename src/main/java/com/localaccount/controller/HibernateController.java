package com.localaccount.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.localaccount.model.Person;
import com.localaccount.repository.PersonRepository;
import com.localaccount.service.IHibernateJpaService;

/**
 * Created by zhangh-ag on 2017-06-12.
 */
@RestController
@RequestMapping(value = "/api")
public class HibernateController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private IHibernateJpaService jpaService;
    @Autowired
    private ApplicationContext applicationContext;
    /**
     * addAccount 添加一个账户
     */
    @PostMapping(value = "/addAccount",produces= {"application/json;charset=UTF-8"})
    public String addAccount(Person json) {
    	JSONObject resultJson = new JSONObject();
        Person oPerson = new Person();
        oPerson.setName("小扎");
        oPerson.setAge(30);
        System.out.println(JSON.toJSON(applicationContext.getEnvironment().getActiveProfiles()));
        try {
            personRepository.save(oPerson);
        } catch(Exception e) {
            e.printStackTrace();
            return resultJson.toJSONString();
        }
        return resultJson.toJSONString();
    }
    @PostMapping(value = "/queryAccount",produces= {"application/json;charset=UTF-8"})
    public String queryAccount(String account) {
    	JSONObject resultJson = new JSONObject();
    	Person oPerson = new Person();
    	oPerson.setName("小扎");
    	oPerson.setAge(30);
    	System.out.println(JSON.toJSON(applicationContext.getEnvironment().getActiveProfiles()));
    	try {
    		personRepository.save(oPerson);
    	} catch(Exception e) {
    		e.printStackTrace();
    		return resultJson.toJSONString();
    	}
    	return resultJson.toJSONString();
    }

    @GetMapping(value = "/jpaTransaction")
    public String testJpaTransaction(){
        try {
            jpaService.testHibernateJpaTransaction();
            return "test";
        } catch(Exception e) {
            return e.getMessage();
        }
    }

}