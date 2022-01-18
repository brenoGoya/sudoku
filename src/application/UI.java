package application;

import sudoku.SudokuTile;

public class UI {
	
	public static void printGrid(SudokuTile[][] tiles) {
		
		for (int i = 0; i < tiles.length; i++) {			
			if(i%3 == 0) {				
				System.out.println();
			}
			System.out.print((9 - i) + " ");			
			
			for(int j = 0; j < tiles.length; j++) {
				
				if(j%3 == 0)
					System.out.print(" ");
					printTile(tiles[i][j]);
			}
			System.out.println();
		}
		System.out.println("   A B C  D E F  G H I");
	}
	
	private static void printTile(SudokuTile tile) {		
		if (tile == null) {
			System.out.print("-");
		}
		else {
			System.out.print(tile);
		}
		System.out.print(" ");
	}
}
