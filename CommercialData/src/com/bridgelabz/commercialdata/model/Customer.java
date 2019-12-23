package com.bridgelabz.commercialdata.model;

public class Customer {
	private String name;
	private int amount;
	private int shares;
	private String symbol;
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + ", shares=" + shares + ", symbol=" + symbol + "]";
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	

}
