package com.masterclass;

public class Test {
    public static void main(String[] args) {
//        SimpleCalculator ed = new SimpleCalculator();
//        ed.setFirstNumber(20);
//        ed.setSecondNumber(5);
//        System.out.println(ed.getAdditionResult());
//        System.out.println(ed.getMultiplicationResult());
        Wall ed = new Wall(5,4);
        System.out.println(ed.getArea());
        ed.setHeight(-1.5);
        System.out.println(ed.getWidth());
        System.out.println(ed.getHeight());

    }
}
