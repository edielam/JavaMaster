package com.masterclass;

public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour) {
	    long answer = 0;
	    if(kilometersPerHour < 0){
            return -1;
        }
        else if(kilometersPerHour >= 0) {
            answer = Math.round(kilometersPerHour/1.609);
        }
	    return answer;
    }
    public static void printConversion(double kilometersPerHour) {
	    long answer = toMilesPerHour(kilometersPerHour);
	    if (answer == -1){
	        System.out.println("Invalid Value");
	    } else {
	        System.out.println(kilometersPerHour+" km/h = "+answer+" mi/h");
	    }
    }

    public static void main(String[] args){
	printConversion(1.5);
    }
}
