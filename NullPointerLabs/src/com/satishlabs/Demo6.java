package com.satishlabs;
//You will also get NullPointerException in Java if you try to synchronize on a null object or try to use the null object inside the synchronized block in Java

public class Demo6 {
	public static void main(String[] args) {
		Trade highbetaTrade = null;
		synchronized (highbetaTrade) {
			System.out.println("This statement is synchronized on null");
		}
	}
}
