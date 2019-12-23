package com.bridgelabz.oops.service;

import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.oops.model.Stock;

public interface StockInf {
	 int totalShares(LinkedList<Stock> stockList);
	 double totalPrice(LinkedList<Stock> stockList);
	 public void displayStock(LinkedList<Stock> stockList);
     LinkedList<Stock> removeStock(LinkedList<Stock>stockList);
     List<Stock>removeStock(List<Stock>stockList);
}
