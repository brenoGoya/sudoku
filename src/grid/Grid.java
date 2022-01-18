package grid;

public class Grid {

	private int rows;
	private int columns;
	private Tile[][] tiles;	
	
	public Grid(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		tiles = new Tile[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Tile tile(int row, int column) {
		return tiles[row][column];
	}
	
	public Tile tile(Position position) {
		return tiles[position.getRow()][position.getColumn()];
	}
}
