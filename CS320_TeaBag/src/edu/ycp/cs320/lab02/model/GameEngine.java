package edu.ycp.cs320.lab02.model;

import java.util.*;

public class GameEngine {
	private String output;
	private ArrayList<Room> roomMap;
	private ArrayList<Actor> actors;
	
	
	//to be replaced with a database
	roomMap = new ArrayList<Room>();
	actors = new ArrayList<Actor>();
	
	Room room0 = new Room(0, new RoomConnections(),new Inventory(0),"room 0 long","room 0 short");
	Room room1 = new Room(0, new RoomConnections(),new Inventory(0),"room 1 long","room 1 short");
	Room room2 = new Room(0, new RoomConnections(),new Inventory(0),"room 2 long","room 2 short");
	Room room3 = new Room(0, new RoomConnections(),new Inventory(0),"room 3 long","room 3 short");
	Room room4 = new Room(0, new RoomConnections(),new Inventory(0),"room 4 long","room 4 short");
	
	
	
	
	//<----------------------->
	
	
	public GameEngine(String output) {
		this.output= output;
	}
	
	public void setOutput(String out) {
		output=out;
	}
	
	public String getOutput() {
		return output;
	}
	public Actor getPlayer() {
		return actors.get(0);
	}

	
	
}
