package edu.school.tests;

import java.awt.Color;

import edu.school.models.SVGLine;
import edu.school.models.SVGPicture;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SVGPicture pic = new SVGPicture();
		pic.add(new SVGLine(10, 10, 180, 250, Color.red, 5));
		pic.add(new SVGLine(280, 10, 0, 368, Color.blue, 1));
		pic.saveToFile("K:\\test2.svg");
	}


}
