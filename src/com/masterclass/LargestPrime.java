package com.masterclass;

import java.util.Arrays;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 0){
            return -1;
        }
        int[] f= factors(number);
        int ans = 0;
        for(int i=0; i <f.length; i++){
            if(primeNumber(f[i])){
                if(f[i]> ans){
                    ans = f[i];
                }
            }
        }
        return  ans;
    }
    public static boolean primeNumber(int number){
        for(int i=2; i <number/2; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static int[] factors(int number){
        int[] ans;
        int count =0;

        for(int i =1; i < number;i++){
            if(number%i==0){
                count++;
            }
        }
        ans = new int[count];
        int j=0;
        for(int i =1; i < number;i++){
            if(number%i==0){
                ans[j]=i;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(50));
        System.out.println(Arrays.toString(factors(50)));
        System.out.println(getLargestPrime(50));
    }
}
