package com.bridgelabz.commercialdata.service;

import java.util.List;

import com.bridgelabz.commercialdata.model.Company;

public interface StockAccount {
	public long value(List<Company>company);
	public void buy(String shareName);
	public void sell(String shareName);
	public void save(String file,String shareName);
	public void printReport();

}
