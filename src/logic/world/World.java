package logic.world;

import java.util.HashMap;

public class World {
	private HashMap<Integer,WorldObject> world;

	public World() {
		world = new HashMap<Integer,WorldObject>();
	}

	public void addWorldObject(int id, WorldObject obj) {
		world.put(id, obj);
	}
	
	public void print() {
		for(int key : world.keySet()) {
			System.out.println("key-id: "+key+" "+world.get(key));
		}
	}

}
