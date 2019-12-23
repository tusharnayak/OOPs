package com.bridgelabz.oops.model;

public class Stock 
{
	private String name;
	private int noOfShares;
	private double pricePerShare;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public double getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public String toString()
	{
		return  "Inventory [name=" + name + ", noOfShares=" + noOfShares + ", pricePerShare=" + pricePerShare + "]";
	}
}
