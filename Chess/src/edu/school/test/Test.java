package edu.school.test;

import edu.schoo.chess.Figure;
import edu.schoo.chess.Rook;
import edu.school.enums.FigureColor;

public class Test {

	public static void main(String[] args) {
		
		Rook r1 = new Rook(1,1,FigureColor.WHITE);
		Rook r2 = new Rook(1,8,FigureColor.WHITE);
		Rook r3 = new Rook(8,1,FigureColor.BLACK);
		Rook r4 = new Rook(8,8,FigureColor.BLACK);
		
		//Knight->
		
		
		Figure[] figures = new Figure[32];
		figures[0] = r1; 
		figures[1] = r2;
		figures[2] = r3;
		figures[3] = r4;
		
		r1.setSelected(true);
		r1.move(figures, 1, 5);
		r1.setSelected(false);
		
		printTable(figures);
		System.out.println();
		
		r2.setSelected(true);
		r2.move(figures, 1, 7);
		r2.setSelected(false);
		
		r3.setSelected(true);
		r3.move(figures, 2, 1);
		r3.setSelected(false);
		
		r4.setSelected(true);
		r4.move(figures, 1, 8);
		r4.setSelected(false);
		
		r4.setSelected(true);
		r4.move(figures, 1, 7);
		r4.setSelected(false);
		printTable(figures);
	}

	public static void printTable(Figure[] figures)
	{
		for(int row = 8; row >= 1; row--)
		{
			for(int column = 1; column<=8; column++)
			{
				boolean printed = false;
				for(Figure f:figures)
				{
					if(f == null)
						continue;
					if(f.getRow() == row && f.getColumn() == column)
					{
						System.out.print(f+" ");
						printed = true;
						break;
					}
				}
				if(!printed)
					System.out.print("O ");
			}
			System.out.println();
		}
		
	}
}
