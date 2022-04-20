package com.study.designpattern.java.abstractfactory.product;

import com.study.designpattern.java.abstractfactory.product.Button;

/**
 * @ClassName MacButton
 * @Author jackchen
 * @Date 2022/4/20 15:11
 * @Description TODO
 **/
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("点击Mac版的button");
    }
}
