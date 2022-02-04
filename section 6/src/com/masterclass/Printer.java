package com.masterclass;

public class Printer{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
	if(tonerLevel > -1 && tonerLevel<= 100){
	    this.tonerLevel = tonerLevel; 
	}
	else{
	    this.tonerLevel = -1;
	}
	this.duplex = duplex;
	this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
	if(tonerAmount > 0 && tonerAmount <=100){
	    if(tonerAmount + this.tonerLevel <= 100){
		return this.tonerLevel += tonerAmount
		    }else {
		return -1;
	    }
	}
	return -1;
    }
    public int printPages(int pages){
	int pagesToPrint = pages;
	if(duplex == true){
	    this.pagesPrinted += pagesToPrint;
	}
	return pagesToPrint;
    }
    public int getPagesPrinted(){
	return this.pagesPrinted;
    }
}
