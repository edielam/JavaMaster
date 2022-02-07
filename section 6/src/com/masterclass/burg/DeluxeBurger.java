package com.masterclass.burg;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
	    super("fixings", "chipings", 19.10, "drinks");
        

    }
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Added one "+name+" at a price of "+price);
        super.price = 19.10;
    }
    @Override
    public void addHamburgerAddition2(String name, double price){
	    System.out.println("Added one "+name+" at a price of "+price);
        this.price += price;
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
	    System.out.println("Added one "+name+" at a price of "+price);
        this.price += price;
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
	    System.out.println("Added one "+name+" at a price of "+price);
        this.price += price;
    }
    @Override
    public double itemizehamhamburger(){
        return this.price;
    }
}
