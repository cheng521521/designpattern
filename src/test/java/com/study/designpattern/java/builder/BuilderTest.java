package com.study.designpattern.java.builder;

import com.study.designpattern.java.bulder.Car;
import com.study.designpattern.java.bulder.CarBuilder;
import com.study.designpattern.java.bulder.CarManualBuilder;
import com.study.designpattern.java.bulder.Director;
import com.study.designpattern.java.bulder.Manual;
import org.junit.jupiter.api.Test;

/**
 * @ClassName BuilderTest
 * @Author jackchen
 * @Date 2022/5/14 22:44
 * @Description TODO
 **/
public class BuilderTest {

    @Test
    void test(){
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
