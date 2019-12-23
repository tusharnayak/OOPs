package com.bridgelabz.oops.controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.model.Inventory;

import com.bridgelabz.oops.repository.Connector;
import com.bridgelabz.oops.service.ServiceImpl;

public class InventoryMain {
	@SuppressWarnings({ "unchecked", "static-access" })
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1.add the inventory");
		System.out.println("2.delete inventory");
		System.out.println("3.calculate total value of the inventory");
		System.out.println("4.display inventory details");
		System.out.println("5.calculate each value of inventory");
		
		int choice=scan.nextInt();
		//InventoryMgmt operation=new InventoryMgmt();
		
		Connector fcon=new Connector();
		ServiceImpl service=new ServiceImpl();
		Inventory inv=new Inventory();
		
		
		do {
			
			switch(choice) {
			case 1:
				
				List<Inventory> listOfIn =fcon.readFile();
			List<Inventory> list=service.addInventory(listOfIn);
				 fcon.writeFile(list);
				 //service.display(listOfIn);
				break;
				
			case 2:
				
				List<Inventory> listOfIn1 =fcon.readFile();
				service.removeInventory1(listOfIn1);
				fcon.writeFile(listOfIn1);
				break;
			case 3:
				List<Inventory> listOfIn2 =fcon.readFile();
				service.totalPrice(listOfIn2);
				break;
			case 4:
				 List<Inventory> listOfin3=fcon.readFile();
				 service.display(listOfin3);
				 break;
				 
			case 5:
				 List<Inventory>listOfIn4=fcon.readFile();
				 service.eachValue(listOfIn4);
				 break;
			}
			
			System.out.println("If you want to perform more Operation Enter true");
		}
	    while(scan.nextBoolean());
		scan.close();
		System.out.println("Operation has performed....");
		
	}
}

	
		
		
		
		
		

		


