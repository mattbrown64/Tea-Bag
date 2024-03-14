package edu.ycp.cs320.lab02.model;

public abstract class Actor implements Commands {
	Inventory inventory;
	Room room;
	
	public Actor(Inventory inventory, Room room) {
		this.inventory=inventory;
		this.room = room;
	}
	public void move(Room r) {
		room = r;
	}
	public String move(String s) {
		Room r = room.findPath(s);
		if (r!=null) {
			room = r;
			return "moved "+ s;
		}
		return "no passage "+ s;
	}
	public Room getRoom() {
		return room;
	}
	
	
}
