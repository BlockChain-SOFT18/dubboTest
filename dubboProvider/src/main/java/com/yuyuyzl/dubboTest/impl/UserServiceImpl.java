package com.yuyuyzl.dubboTest.impl;

import com.yuyuyzl.dubboTest.IUserService;
import com.yuyuyzl.dubboTest.MyReturnClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    public boolean login(String username, String password) {
        logger.info("用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            logger.info("用户校验通过。[username:{}]", username);
            return true;
        }
        logger.info("用户校验失败！[username:{}]", username);
        return false;
    }

    public MyReturnClass getListMapTest(){
        Map<String,String> map1=new HashMap<String, String>();
        for (int i=0;i<3;i++){
            map1.put("k"+i,"v"+i);
        }

        List<Map<String,String>> lm=new ArrayList<Map<String, String>>();
        for (int i=0;i<3;i++){
            lm.add(new HashMap<String, String>(map1));
        }

        return new MyReturnClass(lm);

    }
}
