package com.masterclass.poly;

public class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return super.startEngine();
    }
    @Override
    public String accelerate(){
        return super.accelerate();
    }
    @Override
    public String brake(){
        return super.brake()
    }
    @Override
    public int getCylinders(){
        return super.getCylinders();
    }
    @Override
    public Sting getName(){
        return super.getName();
    }
}
