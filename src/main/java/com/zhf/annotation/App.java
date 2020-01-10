package com.zhf.annotation;

import com.zhf.jdbc.SpringUsers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2020/1/9 0009.
 */
public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("transactionBeanAnnotation.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        SpringUsers springUsers = new SpringUsers();
        springUsers.setUsername("测试3");
        springUsers.setAge(2);

        userService.save(springUsers);
    }
}
