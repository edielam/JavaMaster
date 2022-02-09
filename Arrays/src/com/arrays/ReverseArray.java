package com.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] array){
        int temp;
        int j = array.length -1;
        while(j >= 0){
            for(int i = 0 ; i < j; i++){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            j--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ans = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(ans)));
    }
}
