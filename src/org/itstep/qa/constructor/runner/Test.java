package org.itstep.qa.constructor.runner;

import org.itstep.qa.constructor.home.Rectangle;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(1,2,3,4);
        Rectangle rectangleTwo = new Rectangle(3,4);
        Rectangle rectangleThree = new Rectangle();

        System.out.println("Текущее положение прямоугольников: ");
        System.out.println("Первый прямоугольник: ");
        System.out.println(rectangleOne.getRectPrint());
        System.out.println("Второй прямоугольник: ");
        System.out.println(rectangleTwo.getRectPrint());
        System.out.println("Третий прямоугольник: ");
        System.out.println(rectangleThree.getRectPrint());

        System.out.println("Новое положение созданных прямоугольников: ");
        System.out.println("Первый прямоугольник: ");
        rectangleOne.getMove(1,1);
        System.out.println("Второй прямоугольник: ");
        rectangleTwo.getMove(1,1);
        System.out.println("Третий прямоугольник: ");
        rectangleThree.getMove(1,1);
    }
}
