package com.masterclass;

public class DiagonalStar {
    public static void printSquareStar(int number){
        for(int row =1; row<= number; row++){
            for(int col=1; col<=number; col++){
                if(row == 1 || row == number){
                    System.out.print("*");
                }
                if(row == col){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(5);
    }
}
