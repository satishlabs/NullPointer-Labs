package com.satishlabs;

//Example of NPE when accessing an element of a null array.

public class Demo5 {
	public static void main(String[] args) {
		Trade[] bluechips = null;
		Trade motorola = bluechips[0]; //array is null here
		System.out.println(motorola);
	}
}
