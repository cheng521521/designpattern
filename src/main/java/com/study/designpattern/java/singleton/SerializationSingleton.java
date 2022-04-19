package com.study.designpattern.java.singleton;

import java.io.Serializable;

/**
 * @ClassName SerializationSingleton
 * @Author jackchen
 * @Date 2022/4/19 15:38
 * @Description 单例设计模式的序列化和反序列化
 **/
public class SerializationSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializationSingleton(){}

    private static class SingletonHelper{
        private static final SerializationSingleton instance = new SerializationSingleton();
    }

    public static SerializationSingleton getInstance(){
        return SingletonHelper.instance;
    }


    protected Object readResolve() {
        return getInstance();
    }

}
