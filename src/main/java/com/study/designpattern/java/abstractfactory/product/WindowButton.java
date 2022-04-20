package com.study.designpattern.java.abstractfactory.product;

import com.study.designpattern.java.abstractfactory.product.Button;

/**
 * @ClassName WindowButton
 * @Author jackchen
 * @Date 2022/4/20 15:12
 * @Description TODO
 **/
public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("点击Window的button");
    }
}
