package com.localaccount.service.impl;

import com.alibaba.fastjson.JSON;
import com.localaccount.IDAO.IBaseDao;
import com.localaccount.dao.sql.PersionServiceSql;
import com.localaccount.model.Person;
import com.localaccount.repository.PersonRepository;
import com.localaccount.service.IHibernateJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangh-ag on 2017-06-12.
 */
@Service
public class HibernateJpaServiceImpl implements IHibernateJpaService{

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private IBaseDao baseDao;

    @Override
    public void testHibernateJpaTransaction() {
    	System.out.println(baseDao.queryBySqlReturnListMap(PersionServiceSql.getQuery()));
        Person oPerson1 = new Person();
        oPerson1.setName("tran_1");
        personRepository.save(oPerson1);

        if (null== oPerson1.getAge() ||!oPerson1.getAge().equals(0)) {
            throw new RuntimeException("事务测试");
        }
        Person oPerson2 = new Person();
        oPerson2.setName("tran_2");
        personRepository.save(oPerson2);
    }
}