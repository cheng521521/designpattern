package com.study.designpattern.java.abstractfactory.client;

import com.study.designpattern.java.abstractfactory.factory.Factory;
import com.study.designpattern.java.abstractfactory.product.Button;
import com.study.designpattern.java.abstractfactory.product.CheckBox;

/**
 * @ClassName Application
 * @Author jackchen
 * @Date 2022/4/20 15:17
 * @Description 客户端代码，客户端不关心是什么工厂过来的。只管消费。
 **/
public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(Factory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
