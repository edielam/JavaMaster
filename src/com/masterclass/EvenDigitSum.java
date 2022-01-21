package com.masterclass;

public class EvenDigitSum{
    public static int getEvenDigitSum(int number){
		int sum = 0;
		int rem;
		if (number < 0){
			return -1;
		}
		while (number > 0){
			rem = number % 10;
			if(rem % 2 == 0){
			sum += rem;
			}
			if (number < 10){
			return sum;
			}
			number /= 10;
		}
		return sum;
    }
    public static void main(String[] args){
	int ans = getEvenDigitSum(123456789);
	System.out.println(ans);
    }
}
