package com.study.designpattern.java.abstractfactory.factory;

import com.study.designpattern.java.abstractfactory.product.Button;
import com.study.designpattern.java.abstractfactory.product.CheckBox;

/**
 * @ClassName Factory
 * @Author jackchen
 * @Date 2022/4/20 15:12
 * @Description TODO
 **/
public abstract class Factory {
    public abstract Button createButton();
    public abstract CheckBox createCheckBox();
}
