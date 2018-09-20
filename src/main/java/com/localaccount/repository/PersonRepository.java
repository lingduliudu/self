package com.localaccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localaccount.model.Person;

import java.util.List;

/**
 * 
 */
public interface PersonRepository extends JpaRepository<Person, String> {

    @Query("from Person p where p.name =:name")
    List<Person> findByName(@Param(value = "name") String name);

}