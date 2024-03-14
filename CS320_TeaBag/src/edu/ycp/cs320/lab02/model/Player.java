package edu.ycp.cs320.lab02.model;

public class Player extends Actor {
	
	public Player(Inventory inventory,Room room) {
		super(inventory,room);
	}
	@Override
	public String move(String s) {
		Room r = room.findPath(s);
		System.out.println("coming from"+ room.description());
		if (r!=null) {
			room.setHasBeen();
			room = r;
			System.out.println("going to"+ r.description());
			System.out.println(room == r);
			return "moved "+ s+"\n" +r.description();
		}
		return "no passage "+ s;
	}
	
	
}
