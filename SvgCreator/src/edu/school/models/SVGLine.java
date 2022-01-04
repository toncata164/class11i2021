package edu.school.models;

import java.awt.Color;

public class SVGLine extends SVGObject{

	private int endX;
	private int endY;
	private int strokeWidth;
	
	public SVGLine(int startX, int startY, int endX, int endY,
			Color strokeColor, int strokeWidth)
	{
		super(startX, startY, strokeColor);
		setEndX(endX);
		setEndY(endY);
		setStrokeWidth(strokeWidth);
	}
	
	
	public int getEndX() {
		return endX;
	}


	public void setEndX(int endX) {
		this.endX = endX;
	}


	public int getEndY() {
		return endY;
	}


	public void setEndY(int endY) {
		this.endY = endY;
	}


	public int getStrokeWidth() {
		return strokeWidth;
	}


	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}


	@Override
	public String toSvgCode() {
		String result = "<line ";
		result += "x1=\""+getX()+"\" y1=\""+getY()+"\" ";
		result += "x2=\""+getEndX()+"\" y2=\""+getEndY()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>";
		return result;
	}

}
