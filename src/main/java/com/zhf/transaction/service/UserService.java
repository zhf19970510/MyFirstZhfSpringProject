package com.zhf.transaction.service;

import com.zhf.jdbc.SpringUsers;
import com.zhf.transaction.dao.UserDao;

/**
 * Created on 2020/1/9 0009.
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(SpringUsers springUsers) throws Exception {
        userDao.sayHello(springUsers);
        // 出异常
        int i = 1 / 0;
        userDao.sayHello(springUsers);

    }
}
