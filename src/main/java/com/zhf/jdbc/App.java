package com.zhf.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试spring jdbc功能
 * Created on 2020/1/9 0009.
 */
public class App {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcBean.xml");


    @Test
    public void test(){
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        try {
//            userDao.sayHello();
//            userDao.queryAll();
            List<SpringUsers> users = userDao.query();
            System.out.println(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
