package com.masterclass;
import java.util.Scanner;

public class InputCalculator{
    public static void inputThenPrintSumAndAverage(){
		Scanner inp = new Scanner(System.in);
		int sum = 0;
		long avg = 0;
		int count = 0;
		while(true){
			System.out.println("Enter number: ");
			boolean isAnInt = inp.hasNextInt();
			if(isAnInt){
				int num = inp.nextInt();
				double sum2=0;
				sum += num;
				count++;
				sum2 = (double)(sum);
				avg = Math.round(sum2/count);
			}
			else{
				break;
			}
			inp.nextLine();
		}
		inp.close();
		System.out.println("SUM = "+sum+" AVG = "+avg);
    }
    public static void main(String[] args){
		inputThenPrintSumAndAverage();
		System.out.println(Math.round(3.66));
    }
}
