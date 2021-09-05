package com.bridgeLabz.dataManagement;

public class InventoryManager {

	public static void main(String args[]) {

		InventoryFactory inventoryFactory = new InventoryFactory();

		Inventory item1 = new Inventory("Rice", 5, 55);
		Inventory item2 = new Inventory("wheat", 6, 35);
		Inventory item3 = new Inventory("pulses", 10, 10);

		inventoryFactory.addInventory(item1);
		inventoryFactory.addInventory(item2);
		inventoryFactory.addInventory(item3);

		System.out.println(inventoryFactory.toString());

		System.out.println(item1.toString() + inventoryFactory.getPrice(item1));
		
		System.out.println(item2.toString() + inventoryFactory.getPrice(item2));

		System.out.println(item3.toString() + inventoryFactory.getPrice(item3));


	}

}
