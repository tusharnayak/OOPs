package com.bridgelabz.oops.service;

//import java.awt.List;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.oops.model.Inventory;

public interface InventoryInf {
	int totalWeight(LinkedList<Inventory> inventoryList);
	int totalPrice(LinkedList<Inventory> inventoryList);
	public void displayInventory(LinkedList<Inventory> inventoryList);
	LinkedList<Inventory> removeInventory(LinkedList<Inventory> inventoryList);
	List<Inventory> removeInventory(List<Inventory>inventoryList);
    
}
