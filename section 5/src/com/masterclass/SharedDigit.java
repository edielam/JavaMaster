package com.masterclass;

public class SharedDigit{
    public static boolean hasSharedDigit(int num1, int num2) {
		int digit1 = num1 % 10;
		int digit2 = num1 / 10;
		boolean answer = false;
		if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
			return false;
		}

		if(digit1 == num2%10){
			answer = true;
		}
		else if(digit1 == num2/10){
			answer = true;
		}
		else if(digit2 == num2%10){
			answer = true;
		}
		else if(digit2 == num2/10){
			answer = true;
		}
		else {
			answer = false;
		}

		return answer;
	}
    public static void main(String[] args){
		System.out.println(hasSharedDigit(115, 67));
    }
}
