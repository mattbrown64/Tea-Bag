package edu.ycp.cs320.lab02.model;

public class Inventory {
	int capacity;
	Item[] inventory;
	public Inventory(int capacity) {
		this.capacity = capacity;
		inventory= new Item[capacity];
	}
}
