package edu.npmg.dominoes.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

import edu.npmg.dominoes.DominoTile;

public class DominoTileView extends JComponent{

	private DominoTile tile;
	private Color backgroundColor = Color.white;
	private Color foregroundColor = Color.black;
	
	public DominoTileView(DominoTile tile)
	{
		super();
		this.tile = tile;
		setBounds(0, 0, 200, 100);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(backgroundColor);
		g2d.fill(new Rectangle2D.Double(getBounds().getX(),
				getBounds().getY(), getBounds().getWidth(),
				getHeight()));
		paintNumber(tile.getLeft(), g2d);
		g2d.translate(getBounds().getWidth()/2.0, 0);
		paintNumber(tile.getRight(), g2d);
		g2d.translate(-getBounds().getWidth()/2.0, 0);
	}
	
	public void setBackgroundColor(Color c)
	{
		if(c != null)
			backgroundColor = c;
	}
	
	public void setForegroundColor(Color c)
	{
		if(c != null)
			foregroundColor = c;
	}
	
	private void paintNumber(int n, Graphics2D g)
	{
		int r = 12;
		g.setColor(foregroundColor);
		if(n >= 2)
		{
			int x = 20, y = 20;			
			g.fillOval(x-r, y-r, 2*r, 2*r);
			x = 80;
			y = 80;
			g.fillOval(x-r, y-r, 2*r, 2*r);
		}
		if(n == 6)
		{
			int x = 50, y = 20;
			g.fillOval(x-r, y-r, 2*r, 2*r);
			x = 50;
			y = 80;
			g.fillOval(x-r, y-r, 2*r, 2*r);
		}
		if(n >= 4)
		{
			int x = 80, y = 20;
			g.fillOval(x-r, y-r, 2*r, 2*r);
			x = 20;
			y = 80;
			g.fillOval(x-r, y-r, 2*r, 2*r);
		}
		if(n % 2 == 1)
		{
			int x = 50, y = 50;
			g.fillOval(x-r, y-r, 2*r, 2*r);
		}
	}
}
