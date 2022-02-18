package edu.npmg.dominoes.tests;

import java.awt.Color;

import javax.swing.JFrame;

import edu.npmg.dominoes.DominoTile;
import edu.npmg.dominoes.views.DominoTileView;

public class DominoTileViewTest {
	public static void main(String...strings)
	{
		JFrame window = new JFrame();
		window.setBounds(50, 50, 800, 600);
		window.setVisible(true);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DominoTile tile = new DominoTile(6, 5);
		DominoTileView tv = new DominoTileView(tile);
		tv.setBackgroundColor(Color.YELLOW);
		tv.setForegroundColor(Color.BLUE);
		window.add(tv);
		window.repaint();
	}
}
