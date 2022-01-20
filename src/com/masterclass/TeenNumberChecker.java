package com.masterclass;

public class TeenNumberChecker{
    public static boolean hasTeen(int a, int b, int c){
		if((a >= 13 && a<=19) || (b >=13 && b<=19) || (c >=13 && c <=19)){
			return true;
		}
		return false;
	}
	public static boolean isTeen(int a){
		if(a >= 13 && a <= 19){
			return true;
		}
		return false;
    }

    public static void main(String[] args){
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(23,25,42));
		System.out.println(isTeen(15));
		System.out.println(isTeen(42));
    }
}
