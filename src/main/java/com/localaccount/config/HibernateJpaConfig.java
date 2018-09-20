package com.localaccount.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages="com.localaccount.model")
@EnableJpaRepositories(basePackages= "com.localaccount.repository")
public class HibernateJpaConfig {

}