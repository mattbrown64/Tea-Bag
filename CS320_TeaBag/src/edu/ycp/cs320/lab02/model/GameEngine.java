package edu.ycp.cs320.lab02.model;

import java.util.*;

public class GameEngine {
	private String output;
	private ArrayList<Room> roomMap;
	private ArrayList<Actor> actors;
	
	
	
	
	
	public GameEngine(String output) {
		this.output= output;
		//to be replaced with a database
		roomMap = new ArrayList<Room>();
		actors = new ArrayList<Actor>();
		
		
		
		roomMap.add(new Room(0, new RoomConnections(),new Inventory(0),"room 0 long","room 0 short"));
		roomMap.add(new Room(1, new RoomConnections(),new Inventory(0),"room 1 long","room 1 short"));
		roomMap.add(new Room(2, new RoomConnections(),new Inventory(0),"room 2 long","room 2 short"));
		roomMap.add(new Room(3, new RoomConnections(),new Inventory(0),"room 3 long","room 3 short"));
		roomMap.add(new Room(4, new RoomConnections(),new Inventory(0),"room 4 long","room 4 short"));
		
		actors.add(new Player(new Inventory(0),roomMap.get(0)));
		
		ArrayList<String> path0 = new ArrayList<String>();
		path0.add("north");
		path0.add("south");
		path0.add("east");
		path0.add("west");
		ArrayList<Room> connections0 = new ArrayList<Room>();
		connections0.add(roomMap.get(1));
		connections0.add(roomMap.get(2));
		connections0.add(roomMap.get(3));
		connections0.add(roomMap.get(4));
		roomMap.get(0).setConnections(new RoomConnections(connections0,path0));
		
		ArrayList<String> path1 = new ArrayList<String>();
		path1.add("south");
		ArrayList<Room> connections1 = new ArrayList<Room>();
		connections1.add(roomMap.get(0));
		roomMap.get(1).setConnections(new RoomConnections(connections1,path1));
		
		ArrayList<String> path2 = new ArrayList<String>();
		path2.add("north");
		ArrayList<Room> connections2 = new ArrayList<Room>();
		connections2.add(roomMap.get(0));
		roomMap.get(2).setConnections(new RoomConnections(connections2,path2));
		
		ArrayList<String> path3 = new ArrayList<String>();
		path3.add("west");
		ArrayList<Room> connections3 = new ArrayList<Room>();
		connections3.add(roomMap.get(0));
		roomMap.get(3).setConnections(new RoomConnections(connections3,path3));
		
		ArrayList<String> path4 = new ArrayList<String>();
		path4.add("east");
		ArrayList<Room> connections4 = new ArrayList<Room>();
		connections4.add(roomMap.get(0));
		roomMap.get(4).setConnections(new RoomConnections(connections4,path4));
		
		System.out.println(roomMap.get(0)==roomMap.get(4));
		
		
		//<----------------------->
		//this.output += actors.get(0).getRoom().description();
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
