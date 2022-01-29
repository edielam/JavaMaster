package com.masterclass;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        if(number < 0){
            number = -1 * number;
        }
        int num2 = number;
        int rem = 0;
        while(number >= 10){
            rem = number % 10;
            reverse += rem;
            reverse *= 10;
            number /= 10;
            if(number < 10){
                reverse += number;
            }
        }
        if (reverse == num2){
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));
    }
}
