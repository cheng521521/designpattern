package com.study.designpattern.java.abstractfactory.factory;

import com.study.designpattern.java.abstractfactory.product.Button;
import com.study.designpattern.java.abstractfactory.product.CheckBox;
import com.study.designpattern.java.abstractfactory.product.WindowButton;
import com.study.designpattern.java.abstractfactory.product.WindowCheckBox;

/**
 * @ClassName WindowFactory
 * @Author jackchen
 * @Date 2022/4/20 15:16
 * @Description TODO
 **/
public class WindowFactory extends Factory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
