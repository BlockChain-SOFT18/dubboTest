package com.yuyuyzl.dubboTest;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public boolean login(String username, String password);
    public MyReturnClass getListMapTest();
}
