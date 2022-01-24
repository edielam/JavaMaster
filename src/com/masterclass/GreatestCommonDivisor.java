package com.masterclass;

public class GreatestCommonDivisor{
    public static int getGreatestCommonDivisor(int first, int second){
		int gcf = 0;
		int cf = 0;
		int cf1 = 0;
		int cf2 = 0;
		int min = 0;
		if(first < 10 || second < 10){
			return -1;
		}
		if(first > second){
			min = second;
		}
		if(second > first){
			min = first;
		}
		for(int i = 2; i <= min; i++){
			if(first % i == 0){
			cf1 = i;
			}
			for(int j = 2; j <= min; j++){
			if(second % j == 0){
				cf2 = j;
			}
			if(cf1 == cf2){
				cf = cf1;
			}
			if(cf > gcf){
				gcf = cf;
			}
			}
		}
		return gcf;
	}
    public static void main(String[] args) {
		int ans = getGreatestCommonDivisor(81, 153);
		System.out.println(ans);
    }
}
