package com.bridgelabz.commercialdata.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.commercialdata.model.Company;
import com.bridgelabz.commercialdata.model.Customer;

public class StockImplement implements StockAccount
{
	long share;
	public static List<Company>companyList=new ArrayList<>();
	public static List<Customer>customerList=new ArrayList<>();
	long currentAmount;
	public long valueOf(List<Company>company) {// for getting total value
		long value=totalValueOfShares(company);
		return value;
	}
	public long totalValueOfShares(List<Company>company) {
		return 0;
	}
	public void addMoney() {
		currentAmount=Utility.intScanner();
		boolean result=Utility
	}
	
	public void buy(String name) {
		System.out.println("enter the amount");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private long totalValueOfShares(List<Company> company) {
//		// TODO Auto-generated method stub
//		return 0;
//	}





















	@Override
	public long value(List<Company> company) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public void buy(String shareName) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void sell(String shareName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(String file, String shareName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		
	}
	

}
