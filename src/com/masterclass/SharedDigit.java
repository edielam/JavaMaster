package com.masterclass;

public class SharedDigit{
    public static boolean hasSharedDigit(int num1, int num2){
		int digit1;
		int digit2;
		boolean answer = true;
		if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
			return false;
		}
		while(num1 > 0){
			digit1 = num1 % 10;
			while(num2 > 0){
				digit2 = num2 % 10;
				if(digit2 == digit1){
					answer = true;
				}
				else{
					answer = false;
				}
				num2 /= 10;
			}
			num1 /= 10;
		}
		return answer;
    }
    public static void main(String[] args){
		System.out.println(hasSharedDigit(12, 32));
    }
}
