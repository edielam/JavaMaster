package com.masterclass;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        if(number == 0){
            System.out.println("Zero");
        }
        int revCheck = reverse(number);
        int rev = reverse(number);
        int rem;
        while(rev > 0){
            rem = rev % 10;
            switch(rem){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            rev /= 10;
        }
        if(getDigitCount(number) != getDigitCount(revCheck)){
            for(int i = getDigitCount(revCheck); i < getDigitCount(number); i++){
                System.out.println("Zero");
            }
        }
    }
    public static int reverse(int number){
        int rev = 0;
        int rem;
        int negnum = 0;
        if(number < 0){
            negnum = number;
            number *= -1;
        }
        while(number > 0){
            rem = number % 10;
            rev = (rev * 10) + rem;
            number /= 10;
        }
        if(negnum < 0){
            return rev * -1;
        }
        return rev;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(3420);
    }
}
