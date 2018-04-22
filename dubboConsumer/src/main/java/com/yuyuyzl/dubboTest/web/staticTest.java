package com.yuyuyzl.dubboTest.web;

import com.yuyuyzl.dubboTest.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class staticTest {
    public static int i=0;
    public static IUserService userService;
    public static void init(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        userService = ctx.getBean(IUserService.class);
    }
}
