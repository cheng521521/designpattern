package com.study.designpattern.java.abstractfactory;

import com.study.designpattern.java.abstractfactory.client.Application;
import com.study.designpattern.java.abstractfactory.factory.Factory;
import com.study.designpattern.java.abstractfactory.factory.MacFactory;
import com.study.designpattern.java.abstractfactory.factory.WindowFactory;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    void test(){
        Factory factory;
        Application application;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
            application = new Application(factory);
            application.paint();
        }else {
            factory = new WindowFactory();
            application = new Application(factory);
            application.paint();
        }
    }
}