package com.study.designpattern.java.factory;

/**
 * @author cpx
 * @Description 使用场景: 无法确定对象确切的类别以及依赖关系。易于扩展产品的品类。
 * @date 2022/4/19
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }
}
