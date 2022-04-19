package com.study.designpattern.java.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName BillPugh
 * @Author jackchen
 * @Date 2022/4/19 11:35
 * @Description 用静态内部类实现单例设计模式而且线程安全。
 * 线程安全的原因:是因为虚拟机在类加载的时候会隐式加锁。
 * 优点: 时间换空间，写法简单
 * 缺点: 无法传参如果需要传入context。
 **/
public class BillPugh {
    private BillPugh() {
    }

    private static class SingletionHelper{
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return SingletionHelper.INSTANCE;
    }
}
