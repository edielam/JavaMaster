package com.masterclass;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
		if (summer == true){
			if (temperature >= 25 && temperature <= 45){
			return true;
			}
		}
		else if (temperature >= 25 && temperature <= 35){
			return true;
		}
		return false;
    }
    public static void main(String[] args){
		System.out.println(isCatPlaying(false, 35));
		int[] arr = {5,4,3,2,1};
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] - (arr.length-i));
		}
    }
}
