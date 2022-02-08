package com.masterclass;

public class Palindrome{
    private int x;
    public Palindrome(int x){
		this.x = x;
	}
	public boolean isPalindrome(){
		int y = 0;
		int test = this.x;
		if(this.x < 0){
			return false;
		}
		while(test > 9){
			y = y*10 + (test % 10);
			test /= 10;
		}
		if( test <= 9){
			y = (y*10) +test;
		}
		if (y == this.x){
			return true;
		}
		return false;
    }

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome(-121);
		System.out.println(palindrome.isPalindrome());
	}
}
