/*purpose:java program to read a json file and write to a json file
 * @author: Tushar Ranjan Nayak
 * @since:25th nov 2019
 * ======================================================================*/

package com.bridgelabz.oops.service;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.oops.model.Customer;
import com.bridgelabz.oops.model.Stock;
import com.bridgelabz.oops.utility.Utility;

public class StockImplement 
{
	static LinkedList<Stock>linkedList=new LinkedList<Stock>();
	
	Utility u=new Utility();
	ObjectMapper mapper=new ObjectMapper();
	File file=new File("stock.json");
	Customer customer=new Customer();
	
	
	/*
	 * for add the stock 
	 * ------------------
	 */
	public List<Stock> addStock(List<Stock>listOfStock) throws IOException
	{
		Stock stock=new Stock();
		System.out.println("enter the stock name");
		stock.setName(u.StringScanner());
		
		System.out.println("enter the no of shares");
		stock.setNoOfShares(u.intScanner());
		
		System.out.println("enter the price per share");
		stock.setPricePerShare(u.doubleScanner());
		listOfStock.add(stock);
		
		//mapper.writeValue(file, stock);
		
		
		return listOfStock;
	}
	
	/*
	 * FOR CALCULATING TOTAL PRICE 
	 * -----------------------------
	 */
	public double totalPriceOfShares(List<Stock>list)//method to calculate total price of the stock
	{
		double total=0;
		for (Stock stock : list) {
			total= (total+stock.getPricePerShare());
			}
		return total;
	}
	
	/*
	 * CALCULATING TOTAL SHARES
	 * -------------------------
	 */
	
	public int totalShares(List<Stock>list)//method to calculate total shares
	{
		int total=0;
		for (Stock stock : list) {
			total=total+stock.getNoOfShares();
			}
		return total;
	}
	
	/*
	 * FOR DISPLAYING 
	 * ---------------
	 */
	
	public static void display(List<Stock>list)
	{
		for (Stock stock : list) {
			System.out.println(stock);
			
		}
	}
	
	/*
	 * FOR REMOVING THE ELEMENT
	 *  -------------------------
	 */
	public List<Stock> removeStock (List<Stock>stockList)//this method used to remove the stock
	{
		int count=0;
		System.out.println("enter the stock name to remove");
		String userInput=u.StringScanner();
		for (Stock stock : stockList) {
			if(userInput.equals(stock.getName()))
			{
				stockList.remove(stock);
				count++;
				System.out.println("item removed");
			}
			
		}
		stockList.removeAll(stockList);
		if(count==0)
		{
			System.out.println("no item in the list");
		}
		return stockList;
	}
	
	
//	public void buy(List<Customer> list4) {  //for buying the shares
//		System.out.println("enter the share name to buy");
//		String userInput=Utility.StringScanner();
//		double total=0;
//		for(int i=0;i<list4.size();i++) {
//			if(list4.get(i).getName().equals(userInput)) {
//				System.out.println("how many shares you want to buy");
//				int buyShares=Utility.intScanner();
//				total=buyShares*customer.getAmount();
//				if(customer.getAmount()>total) {
//					System.out.println("share bought");
//				}
//			}
//		}
//	}
}















