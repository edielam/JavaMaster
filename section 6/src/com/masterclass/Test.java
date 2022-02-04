package com.masterclass;

public class Test {
    public static void main(String[] args) {
//        SimpleCalculator ed = new SimpleCalculator();
//        ed.setFirstNumber(20);
//        ed.setSecondNumber(5);
//        System.out.println(ed.getAdditionResult());
//        System.out.println(ed.getMultiplicationResult());
//        Wall ed = new Wall(5,4);
//        System.out.println(ed.getArea());
//        ed.setHeight(-1.5);
//        System.out.println(ed.getWidth());
//        System.out.println(ed.getHeight());
//        Point first = new Point(6, 5);
//        Point second = new Point(3,1);
//        System.out.println(first.distance());
//        System.out.println(first.distance(second));
//        Point point = new Point();
//        System.out.println(first.distance(2, 2));
//        Carpet carpet = new Carpet(1.5);
//        Floor floor = new Floor(5.4,4.5);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println(calculator.getTotalCost());
//        Circle circle = new Circle(3.75);
//        System.out.println(circle.getRadius());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println(cylinder.getVolume());
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        int p = printer.printPages(4);
        System.out.println(printer.getPagesPrinted());
        int q = printer.printPages(8);
        System.out.println(printer.getPagesPrinted());
        System.out.println(q);
    }
}
