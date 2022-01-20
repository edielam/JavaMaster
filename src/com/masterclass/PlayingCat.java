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
    }
}
