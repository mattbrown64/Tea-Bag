package edu.ycp.cs320.lab02.model;

import java.util.*;

public class RoomConnections {
	private ArrayList<Room> connections;
	private ArrayList<String> path;
	
	public RoomConnections(ArrayList<Room> connections,ArrayList<String> path) {
		this.connections = connections;
		this.path = path;
	}
	public RoomConnections() {
		
	}
	
	public Room find(String s) {
		int room = path.indexOf(s);
		if (room!=-1) {
			return connections.get(room);
		}
		return null;
	}
	
	public void printConnections() {
		for(Room room :connections) {
			System.out.println(room.description());
		}
	}
}
