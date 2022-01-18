package com.masterclass;

public class Main {

    public static void main(String[] args) {
        //boolean gameOver = true;
	    if(true){
            System.out.println("Hello world");
        }
        System.out.println(CalScore(23));
    }

    public static String CalScore(int num){
        String ans;
        num *= 30;
        ans = "Hello everybadi: my score->" + num;
        return ans;
    }
}
