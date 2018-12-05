package com.example.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by hsy on 2018/12/5 下午3:01
 */
@RestController
public class JdbcCtroller {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public List<Map<String, Object>> queryUsers(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from auth_user");
        System.out.println("hello, world1123");
        return list;
    }
}
/**/