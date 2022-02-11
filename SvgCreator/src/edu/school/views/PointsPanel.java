package edu.school.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class PointsPanel extends JComponent{
	private int x;
	private int y;
	
	public PointsPanel()
	{
		super();
		setBackground(Color.WHITE);
		x = -10;
		y = -10;
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public PointsPanel(int x, int y)
	{
		this();
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(getBackground());
		g.fillRect(getBounds().x, getBounds().y, getBounds().width,
				getBounds().height);
		if(x >= 0 && y >= 0)
		{
			g.setColor(Color.RED);
			g.drawOval(x-2, y-2, 4, 4);
		}
	}
}
