package com.bridgelabz.oops.model;

public class Inventory {
	private String name;
	private int weight;
	private double pricePerKg;


	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getWeight() {
	return weight;
	}
	public void setWeight(int weight) {
	this.weight = weight;
	}
	public double getPricePerKg() {
	return pricePerKg;
	}
	public void setPricePerKg(double pricePerKg) {
	this.pricePerKg = pricePerKg;
	}
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", price=" + pricePerKg + "]";
	}
}
