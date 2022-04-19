package com.study.designpattern.java.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author cpx
 * @Description 优点: 节省内存 缺点: 线程不安全
 * @date 2022/4/18
 */
public class LazyInitialization {
    private static LazyInitialization instance;


    private LazyInitialization(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static LazyInitialization getInstance() {
        if (null == instance) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
