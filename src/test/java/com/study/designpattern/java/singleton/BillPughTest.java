package com.study.designpattern.java.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class BillPughTest {

    @Test
    void test() {
        new Thread(() -> {
            BillPugh instance = BillPugh.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(() -> {
            BillPugh instance = BillPugh.getInstance();
            System.out.println(instance);
        }).start();

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}