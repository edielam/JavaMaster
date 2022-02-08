package com.masterclass;

public class Palindrome{
    private int x;
    public Palindrome(int x){
	this.x = x;
    }
    public boolean isPalindrome(){
	int y = 0;
	int test = this.x;
	while(test > 9){
	    y = y*10 + (test % 10);
	    test.x /= test;
	}
	if( test <= 9){
	    y = (y*10) +test;
	}
	if (y == this.x){
	    return true;
	}
	return false;
    }
}
