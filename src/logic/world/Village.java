package logic.world;


public class Village extends WorldObject {

	public Village(String name, int x, int y, int player, int points, int rank) {
		super();
		super.name = name;
		super.x = x;
		super.y = y;
		super.player = player;
		super.points = points;
		super.rank = rank;
	}

	@Override
	public String toString() {
		return "Village: " + x + ":" + y + ". Player: " + name;
	}
}
