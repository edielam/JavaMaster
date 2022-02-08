package com.masterclass.burg;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("HealthyBurger",meat,price, "White");

    }
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added one "+this.healthyExtra1Name+" at a price of "+price);
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added one "+this.healthyExtra2Name+" at a price of "+price);
    }
    @Override
    public double itemizeHamburger(){
        double price = super.itemizeHamburger();;
        if(this.healthyExtra1Name != null){
            price += this.healthyExtra1Price;
        }
        if(this.healthyExtra2Name != null){
            price += this.healthyExtra2Price;
        }
        return price;
    }
}
