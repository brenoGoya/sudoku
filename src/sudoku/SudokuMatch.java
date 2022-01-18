package sudoku;

import grid.Grid;

public class SudokuMatch {
	
	private Grid grid;
	
	public SudokuMatch() {
		grid = new Grid(9, 9);
	}
	
	public SudokuTile[][] getTiles() {
		SudokuTile[][] matrix = new SudokuTile[grid.getRows()][grid.getColumns()];
		for (int i = 0; i < grid.getRows(); i++) {
			for (int j = 0; j < grid.getColumns(); j++) {
				matrix[i][j] = (SudokuTile) grid.tile(i, j);
			}
		}
		return matrix;
	}
}
