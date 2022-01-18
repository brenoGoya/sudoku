package application;

import sudoku.SudokuMatch;

public class Program {

	public static void main(String[] args) {		

		SudokuMatch sudokuMatch = new SudokuMatch();
		
		UI.printGrid(sudokuMatch.getTiles());
	}
}
