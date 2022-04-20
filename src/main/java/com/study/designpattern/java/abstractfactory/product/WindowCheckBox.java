package com.study.designpattern.java.abstractfactory.product;

import com.study.designpattern.java.abstractfactory.product.CheckBox;

/**
 * @ClassName WindowCheckBox
 * @Author jackchen
 * @Date 2022/4/20 15:15
 * @Description TODO
 **/
public class WindowCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("点击window check box");
    }
}
