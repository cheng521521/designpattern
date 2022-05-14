package com.study.designpattern.java.bulder;


/**
 * @ClassName Builder
 * @Author jackchen
 * @Date 2022/5/14 22:34
 * @Description 生成器模式
 **/
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
