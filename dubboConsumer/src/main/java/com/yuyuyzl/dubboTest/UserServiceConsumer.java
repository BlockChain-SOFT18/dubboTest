package com.yuyuyzl.dubboTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserServiceConsumer {
    private static Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        IUserService userService =ctx.getBean(IUserService.class);
        logger.info("执行结果：" + userService.login("hello", "hello"));

        List<Map<String,String>> lm= userService.getListMapTest().getLm();
        for(Map<String,String> m: lm){
            Iterator<Map.Entry<String,String>> it=m.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<String,String> e=it.next();
                logger.info("--------------"+e.getKey()+" "+e.getValue());
            }
        }
    }
}
