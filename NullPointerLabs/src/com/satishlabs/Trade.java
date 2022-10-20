package com.satishlabs;

public class Trade {
	private String symbol;
	private int price;
	public static String market;
	
	public Trade(String symbol, int price) {
		this.symbol = symbol;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getMarket() {
		return market;
	}

	public static void setMarket(String market) {
		Trade.market = market;
	}
	
	
}
