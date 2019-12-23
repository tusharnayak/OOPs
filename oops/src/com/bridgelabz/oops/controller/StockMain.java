package com.bridgelabz.oops.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.model.Customer;
import com.bridgelabz.oops.model.Inventory;
import com.bridgelabz.oops.model.Stock;
import com.bridgelabz.oops.repository.StockConnector;
import com.bridgelabz.oops.service.StockImplement;

public class StockMain {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your option");
		System.out.println("1.add stock");
		System.out.println("2.delete stock");
		System.out.println("3.calculate each value of the stock");
		System.out.println("4.display all stock");
		//System.out.println("5.buy share");
		
		int userChoice=scan.nextInt();
		
		Stock stock=new Stock();
		StockImplement implement=new StockImplement();
	
		do {
			StockConnector conn=new StockConnector();
			switch(userChoice) {
			
			
			case 1:
				List<Stock> stockList =conn.readFile();
				 List<Stock>list=implement.addStock(stockList);
				 conn.writeFile(list);
				 break;
				 
			case 2:
				 List<Stock>list1=conn.readFile();
				 implement.removeStock(list1);
				 //conn.writeFile(list1);
				 break;
				 
			case 3:
				 List<Stock>list2=conn.readFile();
				 implement.totalPriceOfShares(list2);
				 break;
				 
			case 4:
				
				List<Stock>list3=conn.readFile();
				StockImplement.display(list3);
				break;
				
//			case 5:
//				LinkedList list5=new LinkedList();
//				List<Customer>list4=conn.readFileCustomer();
//				implement.buy(list4);
//				break;
			}
			//System.out.println("if you want to perform more operation enter true");
			
		}
		while(scan.nextBoolean());
		scan.close();
		System.out.println("operation has performed");
	}

}
