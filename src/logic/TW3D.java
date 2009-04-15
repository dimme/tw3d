package logic;

import java.io.IOException;

import logic.http.DataProvider;
import logic.world.World;

public class TW3D {
	 public static void main(String args[]) throws IOException {
		 World world = new World();
		 DataProvider.addData(world);
		 
		 world.print();
	 }
}
