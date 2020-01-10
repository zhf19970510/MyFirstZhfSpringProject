package com.zhf.ioc;

import com.zhf.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2020/1/8 0008.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)container.getBean("user");
        System.out.println(user.getId()+", "+user.getName());
    }
}
