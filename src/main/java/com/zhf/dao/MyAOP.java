package com.zhf.dao;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created on 2020/1/9 0009.
 */
@Component
@Aspect
public class MyAOP {

    @Pointcut("execution(public void *Dao.*())")
    public void pointCut(){ }

    @Before("pointCut()")
    public void beginTrans(){
        System.out.println("开始事务");
    }
    @After("pointCut()")
    public void commitTrans(){
        System.out.println("提交事务");
    }
}
