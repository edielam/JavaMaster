package com.masterclass.poly;

public class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders, String name){
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }
    public String startEngine(){
	    return this.name+" car is starting...";
    }
    public String accelerate(){
	    return this.name+" car is accelerating...";
    }
    public String brake(){
	    return this.name+" car is braking...";
    }
    public int getCylinders(){
	    return this.cylinders;
    }
    public String getName(){
	    return this.name;
    }
}
