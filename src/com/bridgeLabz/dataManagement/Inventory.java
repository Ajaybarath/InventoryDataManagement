package com.bridgeLabz.dataManagement;

public class Inventory {

	String name;
	String weight;
	int pricePerKg;

	public Inventory(String name, String weight, int pricePerKg) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

	public String getName() {
		return name;
	}

	public String getWeight() {
		return weight;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	@Override
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", pricePerKg=" + pricePerKg + "]";
	}
	

}
