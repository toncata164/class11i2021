package edu.school.models;

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
		String result = "<svg width=\"500\" height=\"500\">";
		for(int i = 0; i<index; i++)
		{
			result += objects[i].toSvgCode();
		}
		result += "</svg>";
		return result;
	}
}
