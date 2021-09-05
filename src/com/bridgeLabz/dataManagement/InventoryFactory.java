package com.bridgeLabz.dataManagement;

import java.util.HashMap;
import java.util.Map;

public class InventoryFactory {

	Map<String, Inventory> inventoryList;
	
	InventoryFactory() {
		inventoryList = new HashMap<>();
	}
	
	public void addInventory(Inventory item) {
		inventoryList.put(item.name, item);
	}
	
	public int getPrice(Inventory item) {
		
		if (inventoryList.containsKey(item.name)) {
			int price = item.getWeight() * item.getPricePerKg();
			return price;
		}
		
		return 0;
	}

	
	@Override
	public String toString() {
		return "InventoryFactory [inventoryList=" + inventoryList + "]";
	}	
	
	
	
}
