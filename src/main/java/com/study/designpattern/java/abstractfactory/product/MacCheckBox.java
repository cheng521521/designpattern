package com.study.designpattern.java.abstractfactory.product;

import com.study.designpattern.java.abstractfactory.product.CheckBox;

/**
 * @ClassName MacCheckBox
 * @Author jackchen
 * @Date 2022/4/20 15:14
 * @Description TODO
 **/
public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("点击MacCheckBox");
    }
}
