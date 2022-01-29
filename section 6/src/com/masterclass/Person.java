package com.masterclass;

public class Person {
	// write your code here
	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public int getAge(){
		return this.age;
	}
	public void setFirstName(String name){
		this.firstName = name;
	}
	public void setLastName(String name){
		this.lastName = name;
	}
	public void setAge(int num){
		if(num < 0 || num > 100){
			this.age = 0;
		}
		else{
			this.age = num;
		}
	}
	public boolean isTeen(){
		if(this.age >12 && this.age<20){
			return true;
		}
		return false;
	}
	public String getFullName(){
		if(this.firstName=="" && this.lastName==""){
			return "";
		}
		else if(this.lastName==""){
			return this.firstName;
		}
		else if(this.firstName==""){
			return this.lastName;
		}
		else{
			return this.firstName +" "+ this.lastName;
		}
	}
}