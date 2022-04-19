package com.study.designpattern.java.singleton;

/**
 * @ClassName EagerInitializedSingleton
 * @Author jackchen
 * @Date 2022/4/19 15:29
 * @Description 空间换时间，线程安全。因为是静态所以启动就初始化好了。
 **/
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
