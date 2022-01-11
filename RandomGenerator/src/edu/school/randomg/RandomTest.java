package edu.school.randomg;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		int [] numbers = new int[] {1,3,4,6,7,8,9,11,12,13};
		Random r = new Random();
		System.out.println(numbers[r.nextInt(numbers.length)]);
	}
	
	private int[] content;
	private int index;
	private boolean allowSameValues;
	
	public void addElement(int element)
	{
		if(index < content.length)
		{
			boolean canAdd = true;
			if(!allowSameValues)
			{
				//check
				canAdd = false;
			}
			if(!canAdd) return;
			content[index] = element;
			index++;
		}
		else
		{
			int currentLength = content.length;
			int newLength = currentLength*2;
			int[] oldContent = content;
			content = new int[newLength];
			for(int i = 0; i<index; i++)
			{
				content[i] = oldContent[i];
			}
			addElement(element);
		}
	}
	
	public void removeAtIndex(int index)
	{
		if(index < 0 || index >= this.index)
			return;
		for(int i = index; i<this.index-1; i++)
		{
			content[i] = content[i+1];
		}
		this.index--;
	}
	
	

}
