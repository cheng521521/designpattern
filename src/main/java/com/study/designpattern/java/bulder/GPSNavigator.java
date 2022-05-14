package com.study.designpattern.java.bulder;

/**
 * @ClassName GPSNavigator
 * @Author jackchen
 * @Date 2022/5/14 22:36
 * @Description TODO
 **/
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
