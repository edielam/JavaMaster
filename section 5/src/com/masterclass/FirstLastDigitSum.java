package com.masterclass;

public class FirstLastDigitSum{
     public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int lastDigit;
        lastDigit = number % 10;
        if(number < 0){
            return -1;
        }
        while(number > 0){
            if (number < 10){
                firstDigit = number;
            }
            number /= 10;
        }
        return firstDigit+lastDigit;
    }

    public static void main(String[] args){
         int ans = 0;
         ans = sumFirstAndLastDigit(5);
        System.out.println(ans);
    }
}
