package sudoku;

import grid.Grid;
import grid.Tile;

public class SudokuTile extends Tile {

	private Color color;

	public SudokuTile(Grid grid, Color color) {
		super(grid);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}	
}
