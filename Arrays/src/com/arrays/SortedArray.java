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
    public void printArray(int[] show){
        for(int i=0; i< show.length; i++){
            System.out.println("Element "+i+" contents "+show[i]);
        }
    }
    public int[] sortIntegers(int[] unsorted) {
        int temp;
        boolean test = true;
        while (test) {
            test = false;
            for(int i = 0; i< unsorted.length-1; i++){
                if(unsorted[i] < unsorted[i+1]){
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    test = true;
                }
            }
        }
        return unsorted;
    }
}
