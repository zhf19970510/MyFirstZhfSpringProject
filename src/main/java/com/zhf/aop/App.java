package com.zhf.aop;

import com.zhf.dao.IUserDao;
import com.zhf.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试aop功能
 * Created on 2020/1/9 0009.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        try {
            userDao.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------");
        OrderDao orderDao = (OrderDao) applicationContext.getBean("orderDao");
        try {
            orderDao.update();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
