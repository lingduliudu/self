package com.localaccount.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhangh-ag on 2017-06-12.
 */
public interface IHibernateJpaService {

    @Transactional
    void testHibernateJpaTransaction();

}