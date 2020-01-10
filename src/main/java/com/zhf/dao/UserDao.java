package com.zhf.dao;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

/**
 *  优化：
 *  1.连接管理
 *  2.重复代码的优化
 * Created on 2020/1/9 0009.
 */
@Component
public class UserDao implements IUserDao {

    // 连接池由IOC容器进行创建，注入
//    private DataSource dataSource;
//    public void setDataSource(DataSource dataSource){
//        this.dataSource = dataSource;
//    }

    @Override
    public void sayHello() throws Exception{
        System.out.println("hello world");
        // JDBC连接
//        Connection connection = dataSource.getConnection();
//        // Statement
//        Statement statement = connection.createStatement();
//        String sql = "insert into springusers(username,age) values('Test',1)";
//        statement.execute(sql);
//        statement.close();
    }
}
