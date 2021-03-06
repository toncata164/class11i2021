package edu.school.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class PointsPanel extends JComponent{
	
	private double[] points = new double[6];
	private int index = 0;
	
	private int movePointX = -1;
	private int movePointY = -1;
	
	private double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
	}
	
	private double area()
	{
		double a = distance(points[0], points[1], points[2], points[3]);
		double b = distance(points[4], points[5], points[2], points[3]);
		double c = distance(points[0], points[1], points[4], points[5]);
		double p = (a+b+c)/2.0;
		double S = Math.sqrt((p-a)*(p-b)*(p-c)*p);
		return S;
	}
	
	public PointsPanel()
	{
		super();
		setBackground(Color.WHITE);
		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				if(movePointX != -1 && movePointY != -1) {
					points[movePointX] = e.getX();
					points[movePointY] = e.getY();	
					repaint();
				}
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
			
		});
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(index <points.length)
				{
					points[index] = e.getX();
					points[index+1] = e.getY();
					index += 2;
					repaint();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				int currentX = e.getX();
				int currentY = e.getY();
				for(int i = 0; i<index; i+=2)
				{
					if( points[i]-5 < currentX &&
							currentX < points[i]+5 &&
							points[i+1]-5 < currentY &&
							currentY < points[i+1]+5)
					{
						movePointX = i;
						movePointY = i+1;
						break;
					}
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				movePointX = -1;
				movePointY = -1;
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
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(getBackground());
		g2d.fillRect(getBounds().x, getBounds().y, getBounds().width,
				getBounds().height);
		if(index > 0)
		{
			for(int i = 0; i<index; i+=2)
			{
				g2d.setColor(Color.RED);
				Ellipse2D ellipse = new Ellipse2D.Double(points[i]-5, points[i+1]-5, 10, 10);
				g2d.draw(ellipse);
				g2d.fill(ellipse);
			}
		}
		if(index == 6)
		{
			g2d.setColor(Color.BLACK);
			Line2D line1 = new Line2D.Double(points[0], points[1], points[2], points[3]);
			Line2D line2 = new Line2D.Double(points[2], points[3], points[4], points[5]);
			Line2D line3 = new Line2D.Double(points[4], points[5], points[0], points[1]);
			g2d.draw(line1);
			g2d.draw(line2);
			g2d.draw(line3);
			g2d.drawString(String.format("Area = %.2f", area()), 0, 20);
		}
	}
}
