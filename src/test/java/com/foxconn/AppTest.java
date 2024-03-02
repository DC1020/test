package com.foxconn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class AppTest {

    @Resource
    public JdbcTemplate jdbcTemplate;

    @Test
    public void test01() {
        jdbcTemplate.execute("select * from tbl_user");
    }

    @Test
    public void test02(){
        jdbcTemplate.execute("insert into tbl_user(name, age) values ('zs', 23)");
    }

}
