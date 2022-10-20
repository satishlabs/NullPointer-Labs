package com.satishlabs;

//java.lang.NullPointerException when throwing null as an exception
/*
 If you throw an Exception object and if that is null you will 
 get a null pointer exception as shown in the below example

 * */
public class Demo3 {
	public static void main(String[] args) {
		RuntimeException nullException  = null;
		throw nullException;
	}
}
