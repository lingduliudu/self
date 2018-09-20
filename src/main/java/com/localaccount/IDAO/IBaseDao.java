package com.localaccount.IDAO;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class IBaseDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 手动执行jdbc测试
     */
    public List<Map<String,Object>> queryBySqlReturnListMap(String sql) {
       return this.jdbcTemplate.queryForList(sql);
    }
}
