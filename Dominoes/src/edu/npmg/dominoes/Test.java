package edu.npmg.dominoes;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		DominoTile tile1 = new DominoTile(2,5);
		DominoTile tile2 = new DominoTile(0,5);
		DominoTile tile3 = new DominoTile(1,6);
		DominoTile tile4 = new DominoTile(6,5);
		
		DominoTable table = new DominoTable();
		
		//Ako na masata se poqvi novo pulche budi taka lubezen da q prerisuvash
		
		DominoTableEventImplementation tableEvent = new 
				DominoTableEventImplementation(table);
	
		/*
		DominoTableEvent tableEvent = new DominoTableEvent()
		{

			@Override
			public void onDominoTileAdded() {
				table.printTable();
			}
			
		};*/
		table.addDominoTableEvent(tableEvent);
		
		table.addLeft(tile4);
		table.addRight(tile2);
		table.addRight(tile1);
		table.addLeft(tile3);
	
		//Ako na masata se poqvi novo pulche budi taka lubezen da q prerisuvash
		
		Scanner input = new Scanner(System.in);
		//table.printTable();
		
		while(true)
		{
			String userInput = input.nextLine();
			if("exit".equals(userInput))
			{
				break;
			}
			if(userInput.startsWith("add left"))
			{
				String arguments = userInput.replace("add left", "");
				String[] splitted = arguments.split(",");
				DominoTile newLeft = new DominoTile(Integer.parseInt(splitted[0].trim()),
						Integer.parseInt(splitted[1].trim()));
				table.addLeft(newLeft);
				
				//add left 4,5
				//add left   4,  5
			}
			if(userInput.startsWith("add right"))
			{
				
			}
		}
	}

}
// 1,6 / 6,5 / 5,0 /

