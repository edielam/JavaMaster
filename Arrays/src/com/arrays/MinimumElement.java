package com.arrays;

import java.util.Scanner;

public class MinimumElement {
    public static int readInteger(){
        System.out.println("Enter number of elements: ");
        Scanner readnum = new Scanner(System.in);
        return readnum.nextInt();
    }
    public static int[] readElements(int num){
        Scanner elem = new Scanner(System.in);
        int[] out = new int[num];
        for(int i =0; i < out.length; i++){
            System.out.println("Enter number: ");
            out[i] = elem.nextInt();
            elem.nextLine();
        }
        return out;
    }
    public static int findMin(int[] arr){
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
