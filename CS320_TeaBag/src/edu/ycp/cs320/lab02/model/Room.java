package edu.ycp.cs320.lab02.model;

public class Room {
	private int roomId;
	private RoomConnections connections;
	private Inventory inventory;
	private boolean hasBeen;
	private String descriptionLong;
	private String descriptionShort;
	
	public Room(int roomId, RoomConnections connections,Inventory inventory,String descriptionLong, String descriptionShort) {
		this.roomId= roomId;
		this.connections=connections;
		this.inventory = inventory;
		this.descriptionShort = descriptionShort;
		this.descriptionLong = descriptionLong;
	}
	
	public Room findPath(String s) {
		return connections.find(s);
	}
	
	public String description() {
		if(hasBeen) {
			return descriptionShort;
		}
		return descriptionLong;
	}
	public void setHasBeen() {
		hasBeen = true;
	}
}
