package com.study.designpattern.java.abstractfactory.factory;

import com.study.designpattern.java.abstractfactory.product.Button;
import com.study.designpattern.java.abstractfactory.product.CheckBox;
import com.study.designpattern.java.abstractfactory.product.MacButton;
import com.study.designpattern.java.abstractfactory.product.MacCheckBox;

/**
 * @ClassName MacFactory
 * @Author jackchen
 * @Date 2022/4/20 15:13
 * @Description TODO
 **/
public class MacFactory extends Factory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
