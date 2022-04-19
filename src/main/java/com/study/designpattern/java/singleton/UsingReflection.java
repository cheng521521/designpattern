package com.study.designpattern.java.singleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName UsingReflection
 * @Author jackchen
 * @Date 2022/4/19 15:27
 * @Description 用反射实现单例.反射可以破坏单例设计模式.
 * 如何防止反射破坏单例设计模式。可以用枚举来实现单例设计模式
 **/
public class UsingReflection {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
