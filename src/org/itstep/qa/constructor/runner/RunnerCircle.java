package org.itstep.qa.constructor.runner;

import org.itstep.qa.constructor.home.Circle;

public class RunnerCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circleOne = new Circle();

        //circle.setRadius(2);
        double str = circle.getRadius();
        System.out.println("Радиус круга равен " + str);
        double s = circle.getAreaCircle();
        System.out.println("Площадь круга равна " + s);
    }

}
