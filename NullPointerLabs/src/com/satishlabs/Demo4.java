package com.satishlabs;


//example of NullPointerException is when getting the length of an array that is null

	
public class Demo4 {
	public static void main(String[] args) {
		Trade[] bluechips = null;
		int length = bluechips.length; //array is null here
		System.out.println(length);
	}
}
