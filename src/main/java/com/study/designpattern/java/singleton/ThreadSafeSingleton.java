package com.study.designpattern.java.singleton;

/**
 * @author cpx
 * @Description
 * @date 2022/4/18
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;


    private ThreadSafeSingleton(){}


    /**
     * 缺点:锁的粒度不够细。浪费性能
     * @return
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == instance) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }


    public static ThreadSafeSingleton getInstanceUp() {
        if (null == instance) {
            synchronized (ThreadSafeSingleton.class) {
                if (null == instance) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
