package com.zhf.transaction.test;

import com.zhf.jdbc.SpringUsers;
import com.zhf.transaction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2020/1/9 0009.
 */
public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("transactionBean.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        SpringUsers springUsers = new SpringUsers();
        springUsers.setUsername("测试");
        springUsers.setAge(2);

        userService.save(springUsers);
    }
}
