package com.bridgelabz.commercialdata.model;

public class Company {
	private String companyName;
	private int noOfShares;
	private int pricePerShare;
	
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", noOfShares=" + noOfShares + ", pricePerShare=" + pricePerShare
				+ "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public void setPricePerShare(int pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	
	
	
}
