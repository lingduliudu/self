package com.localaccount.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localaccount.model.Account;

/**
 * 
 */
public interface AccountRepository extends JpaRepository<Account, String> {

    @Query("from Account p where p.accountno =:accountno")
    List<Account> findByAccountNo(@Param(value = "accountno") String name);

}