package logic;

import logic.http.DataProvider;
import logic.world.World;

public class TW3D {
	 public static void main(String args[]) {
		 World world = new World(DataProvider.fetchData());
		 
		 System.out.println(world.toString());
	 }
}
