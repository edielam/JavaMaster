package com.masterclass;

public class MinutesToYearsDaysCalculator{
	public static void printYearsAndDays(long minutes){
		long days;
		long years;
		long daysrem;
		if(minutes < 0){
			System.out.println("Invalid Value");
		}
		else{
			days = minutes / 1440;
			years = days / 365;
			daysrem = days % 365;
			System.out.println(minutes+" min = "+years+" y and "+daysrem+" d");
		}
	}
    public static void main(String[] args){
	printYearsAndDays(525600);
    }
}
