package com.masterclass;

public class LargestPrime2 {
    public static int getLargestPrime(int number){
        if(number < 0){
            return -1;
        }
        int[] ans;
        int count =0;

        for(int i =1; i <= number;i++){
            if(number%i==0){
                count++;
            }
        }
        ans = new int[count];
        int j=0;
        for(int i =1; i <= number;i++){
            if(number%i==0){
                ans[j]=i;
                j++;
            }
        }

        int ans2 =1;
        int prime = 0;
        int gprime = 0;
        int l = 0;
        while(l < ans.length){
            for(int g=2; g<ans[l]; g++){
                if(ans[l]%g==0){
                    ans2 = 0;
                }
            }
            if(ans2 == 1){
                prime = ans[l];
            }
            if(prime > gprime){
                gprime = prime;
            }
            l++;
        }
        if(gprime <= 1){
            return -1;
        }

        return  gprime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));;
    }
}
