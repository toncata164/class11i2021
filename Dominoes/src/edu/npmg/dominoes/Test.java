package edu.npmg.dominoes;

public class Test {

	public static void main(String[] args) {
		DominoTile tile1 = new DominoTile(2,5);
		DominoTile tile2 = new DominoTile(0,5);
		DominoTile tile3 = new DominoTile(1,6);
		DominoTile tile4 = new DominoTile(6,5);
		DominoTable table = new DominoTable();
		table.addLeft(tile4);
		table.addRight(tile2);
		table.addRight(tile1);
		table.addLeft(tile3);
		
		table.printTable();
		
	}

}
// 1,6 / 6,5 / 5,0 /