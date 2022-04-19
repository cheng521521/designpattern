package com.study.designpattern.java.singleton;

/**
 * @author cpx
 * @Description 这个和 EagerInitialization是一样的
 * @date 2022/4/18
 */
public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;


    private StaticBlockInitialization(){}


    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("出错了");
        }
    }


    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
