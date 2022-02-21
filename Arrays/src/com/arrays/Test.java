package com.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        SortedArray eg = new SortedArray();
//        int[] ans = eg.getIntegers(5);
//        eg.printArray(ans);
//        int[] ans2 = eg.sortIntegers(ans);
//        eg.printArray(ans2);
//        MinimumElement test = new MinimumElement();
//        int[] ans = test.readElements(test.readInteger());
//        System.out.println(test.findMin(ans));
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}
