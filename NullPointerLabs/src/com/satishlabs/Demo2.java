package com.satishlabs;
//NullPointerException in Java while accessing field on a null reference

public class Demo2 {
	public static void main(String[] args) {
		Trade fxTrade = null;
		int price = fxTrade.getPrice();//here fxtrade is null, you can’t access field here
		System.out.println(price);
	}
}
