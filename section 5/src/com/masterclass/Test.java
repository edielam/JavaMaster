package com.masterclass;

public class Test {
    private static String name;

    public Test(String name){
        Test.name = name;
    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Test ed = new Test("jajme");
        Test jd = new Test("Jiip");
        Test kd = new Test("Jollof");
        ed.printName();
    }
}
