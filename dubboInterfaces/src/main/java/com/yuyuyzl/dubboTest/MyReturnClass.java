package com.yuyuyzl.dubboTest;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class MyReturnClass implements Serializable{
    public List<Map<String, String>> getLm() {
        return lm;
    }

    public void setLm(List<Map<String, String>> lm) {
        this.lm = lm;
    }

    private List<Map<String,String>> lm;

    public MyReturnClass(List<Map<String,String>> lm){
        this.lm = lm;
    }
}
