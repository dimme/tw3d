package logic.http;

import logic.world.Grass;
import logic.world.Village;
import logic.world.World;
import logic.world.WorldObject;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class DataProvider {

	public static void addData(World world) throws IOException {

		DataInputStream villageStream = new DataInputStream(
				new FileInputStream("C:\\village.txt"));

		String line = "";
		while ((line = villageStream.readLine()) != null) {
			String[] lins = line.split(",");

			Village village = new Village(lins[1], Integer.parseInt(lins[2]),
					Integer.parseInt(lins[3]), Integer.parseInt(lins[4]),
					Integer.parseInt(lins[5]), Integer.parseInt(lins[6]));

			world.addWorldObject(Integer.parseInt(lins[0]), village);
		}
		System.out.println("FINITO!");
	}

}
