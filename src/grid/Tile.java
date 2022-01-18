package grid;

public class Tile {

	protected Position position;
	private Grid grid;
	
	public Tile(Grid grid) {
		this.grid = grid;
		position = null;
	}
	
	protected Grid getBoard() {
		return grid;
	}
}
