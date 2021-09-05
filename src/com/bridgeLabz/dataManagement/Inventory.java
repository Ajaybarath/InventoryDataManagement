package com.bridgeLabz.dataManagement;

public class Inventory {

	private String name;
	private int weight;
	private int pricePerKg;

	public Inventory(String name, int weight, int pricePerKg) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
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
