package com.zhf.annotation;

import com.zhf.jdbc.SpringUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created on 2020/1/9 0009.
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;
    @Transactional
    public void save(SpringUsers springUsers) throws Exception {
        userDao.sayHello(springUsers);
        // 出异常
        int i = 1 / 0;
        userDao.sayHello(springUsers);

    }
}
