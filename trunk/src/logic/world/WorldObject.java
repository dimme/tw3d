package logic.world;


public abstract class WorldObject {
	protected String name;
	protected int x, y;
	protected int player, points, rank;
		
	public abstract String toString();
}
