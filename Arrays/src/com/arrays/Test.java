package com.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        SortedArray eg = new SortedArray();
//        int[] ans = eg.getIntegers(5);
//        eg.printArray(ans);
//        int[] ans2 = eg.sortIntegers(ans);
//        eg.printArray(ans2);
        MinimumElement test = new MinimumElement();
        int[] ans = test.readElements(test.readInteger());
        System.out.println(test.findMin(ans));
    }
}
