package org.itstep.qa.constructor.home;

public class Circle {
    private double radius;
    private double pi;

    public Circle (double radius){
        this.radius = radius;
        this.pi = 3.14;
    }

    public Circle(){}

    //public void setRadius(double in){ //задать радиус
        //this.radius = in;
    //}

    public double getRadius(){//узнать радиус
        return radius;
    }

    public double getAreaCircle(){//узнать площадь
        double s = pi*radius*radius;
        return s;
    }
}
