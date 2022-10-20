package com.satishlabs;

//Java  NullPointerException while calling instance method on null object

/*
 This is probably the most common cause of this error, 
 you call method on some object and found that the reference is null, 
 always perform null check if you see possibility of null before calling any method on object

 * */
public class Demo1 {
	public static void main(String[] args) {
		Trade pennyStock = null;
		pennyStock.getPrice(); //this will throw NullPointerException
		
		System.out.println(pennyStock);
	}
}
