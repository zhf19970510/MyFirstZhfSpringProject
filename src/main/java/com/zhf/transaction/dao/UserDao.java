package com.zhf.transaction.dao;

import com.zhf.jdbc.SpringUsers;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 优化：
 * 1.连接管理
 * 2.重复代码的优化
 * Created on 2020/1/9 0009.
 */
public class UserDao {

    //使用jdbcTemplate，对于JDBC操作优化

    JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public void sayHello(SpringUsers springUsers) throws Exception {
//        System.out.println("hello world");
//        // JDBC连接
//        Connection connection = dataSource.getConnection();
//        // Statement
//        Statement statement = connection.createStatement();
        String sql = "insert into springusers(username,age) values(?,?)";
//        statement.execute(sql);
//        statement.close();

        jdbcTemplate.update(sql,new Object[]{springUsers.getUsername(),springUsers.getAge()});
    }


    public List<SpringUsers> queryAll(){
        String sql = "select id,username,age from springusers";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
        return null;
    }

    public List<SpringUsers> query(){
        String sql = "select id,username,age from springusers";
        return jdbcTemplate.query(sql, new RowMapper<SpringUsers>() {
              @Override
              public SpringUsers mapRow(ResultSet resultSet, int i) throws SQLException {
                  SpringUsers springUsers = new SpringUsers();
                  springUsers.setId(resultSet.getInt("id"));
                  springUsers.setUsername(resultSet.getString("username"));
                  springUsers.setAge(resultSet.getInt("age"));
                  return springUsers;
              }
              //行处理

        });
    }

}
