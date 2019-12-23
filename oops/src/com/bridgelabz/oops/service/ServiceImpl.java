package com.bridgelabz.oops.service;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.oops.model.Inventory;
import com.bridgelabz.oops.repository.Connector;
import com.bridgelabz.oops.utility.Utility;

public class ServiceImpl implements InventoryInf {
	//static LinkedList<Inventory> linkedList = new LinkedList<Inventory>();
	Utility u = new Utility();
	ObjectMapper mapper = new ObjectMapper();
	File file = new File("json1.json");
	

	/*
	 * for add the inventory ----------------------
	 */
	public List<Inventory> addInventory(List<Inventory> listOfInventory)
			throws JsonGenerationException, JsonMappingException, IOException {

		Inventory inventory = new Inventory();

		System.out.println("enter the name of the inventory to add");
		inventory.setName(u.StringScanner());// it is taking the user input and set the name of the item
		// inventory.getName();//here it is get the name of the item that is provided by
		// the user

		System.out.println("enter the weight of the inventory");
		inventory.setWeight(u.intScanner());
		// inventory.getWeight();

		System.out.println("enter the pricePerkg of the inventory");
		inventory.setPricePerKg(u.doubleScanner());
		// inventory.getPricePerKg();
		listOfInventory.add(inventory);
		// mapper.writeValue(file, inventory);

		return listOfInventory;
	}

	/*
	 * for calculating total weight ------------------------------
	 */

	public int totalWeight(List<Inventory> inventoryList)// for calculating the total weight of the inventory
	{
		int total = 0;
		for (Inventory inventory : inventoryList) {
			total = total + inventory.getWeight();
		}
		return total;
	}
	/*
	 * for total price ----------------
	 */

	public void totalPrice(List<Inventory> inventoryList)// for calculating the total price of the inventory
	{
		double total = 0;
		for (Inventory inventory : inventoryList) {
			total = total + inventory.getPricePerKg()*inventory.getWeight();
		}
		System.out.println("total value is "+total);
		//return total;
	}
	/*
	 * for display the inventory ---------------------------
	 */

	public static void display(List<Inventory> inventoryList)// for displaying all the inventory details presenting in
																// the inventory list
	{
		for (Inventory inventory : inventoryList) {
			System.out.println(inventory);

		}
	}
	public static void eachValue(List<Inventory>inventoryList) throws JsonParseException, JsonMappingException, IOException
	{
		double total=0;
		for (Inventory inventory : inventoryList) {
			total=inventory.getPricePerKg()*inventory.getWeight();
			System.out.println("total price of "+inventory.getName()+"="+total);
			
		}
//		Inventory inventory1=new Inventory();
//		
//		double total=0;
//		
//		for(int i=0;i<inventoryList.size();i++)
//		{
//			total=inventory1.getPricePerKg()*inventory1.getWeight();
//			System.out.println("total price of "+inventory1.getName()+" is ="+total);
//		}
//		
//		
	}

	/*
	 * for remove the inventory -------------------------
	 */
	@SuppressWarnings("unlikely-arg-type")
	public List<Inventory> removeInventory1(List<Inventory> inventoryList) {
		System.out.println("enter the inventory name");
		String userInput = u.StringScanner();
		
		int count = 0;
		
		LinkedList<Inventory> list = new LinkedList<Inventory>();
		
		for(int i=0;i<inventoryList.size();i++) {
			
			if(inventoryList.get(i).getName().equals(userInput))
			{
				inventoryList.remove(i);
				count++;
				System.out.println("item removed");
			}
		}
		inventoryList.removeAll(list);
		if(count==0) {
			System.out.println("no data present in the list");
		}
		return list;
			
//		for (Inventory inventory : list) {
//			if (userInput.equals(inventory.getName())) {
//				System.out.println("hello");
//				list.remove(inventory);
//				count++;
//				System.out.println("item removed");
//			}
//		}
//		inventoryList.removeAll(list);
//		if (count == 0) {
//			System.out.println("no such data present");
//		}
//		return inventoryList;

	}

//	public static void save(List<Inventory> inventory, JsonGenerator file)
//			throws JsonGenerationException, JsonMappingException, IOException {
//		File fileSave = new File("json1.json");
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.writeValue(file, inventory);
//		System.out.println("saved successfully");
//	}

	@Override
	public int totalWeight(LinkedList<Inventory> inventoryList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalPrice(LinkedList<Inventory> inventoryList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayInventory(LinkedList<Inventory> inventoryList) {
		// TODO Auto-generated method stub

	}

	@Override
	public LinkedList<Inventory> removeInventory(LinkedList<Inventory> inventoryList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inventory> removeInventory(List<Inventory> inventoryList) {
		// TODO Auto-generated method stub
		return null;
	}

}
