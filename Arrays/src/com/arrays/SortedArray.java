package com.arrays;

import java.util.Scanner;

public class SortedArray {
    public int[] getIntegers(int bigness){
        System.out.println("Please enter numbers: ");
        Scanner values = new Scanner(System.in);
        int[] ans = new int[bigness];
        for (int i = 0; i< ans.length; i++){
            ans[i] = values.nextInt();
        }
        return ans;
    }
}
