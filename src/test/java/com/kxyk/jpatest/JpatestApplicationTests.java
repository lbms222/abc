package com.kxyk.jpatest;

import com.kxyk.jpatest.dao.JpaTestDao;
import com.kxyk.jpatest.pojo.Custom;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@SpringBootTest
@RunWith(SpringRunner.class)
class JpatestApplicationTests {
    @Autowired
    JpaTestDao dao;

    @Test
    void contextLoads() {
    }

    @Test
    public void JpaTest(){
        List<Custom> list = dao.findAll();
        System.out.println("list = " + list);
    }

}

