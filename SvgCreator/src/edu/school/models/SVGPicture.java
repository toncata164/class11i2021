package edu.school.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SVGPicture {
	private SVGObject[] objects;
	private int index;
	
	public SVGPicture()
	{
		objects = new SVGObject[20];
		index = 0;
	}
	
	public void add(SVGObject object)
	{
		//check if object is null
		
		if(index >= objects.length)
		{
			//extend the array of objects
		}
		objects[index] = object;
		index++;
	}
	
	public String toString()
	{
		String result = "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 500 500\">";
		for(int i = 0; i<index; i++)
		{
			result += objects[i].toSvgCode();
		}
		result += "</svg>";
		return result;
	}
	
	public void saveToFile(String filepath)
	{
		try {
			Files.writeString(Paths.get(filepath),
					toString(), StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
