package com.masterclass;

public class Palindrome{
    private int x;
    public Palindrome(int x){
		this.x = x;
	}
	public int isPalindrome(){
		int y = 0;
		int test = this.x;
		while(test > 9){
			y = y*10 + (test % 10);
			test /= test;
		}
		if( test <= 9){
			y = (y*10) +test;
		}
		if (y == this.x){
			return y;
		}
		return y;
    }

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome(121);
		System.out.println(palindrome.isPalindrome());
	}
}
