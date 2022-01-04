package edu.school.models;

import java.awt.Color;

public abstract class SVGObject {
	private int x;
	private int y;
	private Color color;
	
	public SVGObject(int x, int y, Color color)
	{
		setX(x);
		setY(y);
		setColor(color);
	}
	
	public SVGObject(int x, int y)
	{
		this(x, y, Color.BLACK);
	}
	
	public SVGObject()
	{
		this(0,0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract String toSvgCode();
	
	protected String toRGB(Color color)
	{
		if(color == null)
			return "";
		String result = "rgb(";
		result += color.getRed()+",";
		result += color.getGreen()+",";
		result += color.getBlue()+")";
		return result;
	}
}
