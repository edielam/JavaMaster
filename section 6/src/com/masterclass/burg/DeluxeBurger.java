package com.masterclass.burg;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
	    super("White", "Sausage", 15.10, "drinks");
        super.addHamburgerAddition1("Chips", 2.0);
        super.addHamburgerAddition2("Drinks", 2.0 );

    }
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot add");
    }
    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot add");
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot add");
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot add");
    }
    @Override
    public double itemizeHamburger(){
        return super.itemizeHamburger();
    }

}
