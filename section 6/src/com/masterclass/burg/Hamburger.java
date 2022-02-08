package com.masterclass.burg;

public class Hamburger{
    private double price;
    private String name;
    private String meat;
    private String breadRollType;
    public Hamburger( String name, String meat, double price, String breadRollType){
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added one "+this.addition1Name+" at a price of "+price);
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added one "+this.addition2Name+" at a price of "+price);
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added one "+this.addition3Name+" at a price of "+price);
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added one "+this.addition4Name+" at a price of "+price);
    }
    public double itemizeHamburger(){
        if(this.addition1Name != null){
            this.price += this.addition1Price;
        }
        if(this.addition2Name != null){
            this.price += this.addition2Price;
        }
        if(this.addition3Name != null){
            this.price += this.addition3Price;
        }
        if(this.addition4Name != null){
            this.price += this.addition4Price;
        }
        return this.price;
    }
}
