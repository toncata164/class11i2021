package edu.npmg.dominoes;

public class DominoTile {
	private int left;
	private int right;
	
	public void setLeft(int left)
	{
		if(left >= 0 && left <= 6)
		{
			this.left = left;
		}
	}
	
	public void setRight(int right)
	{
		if(right >= 0 && right <= 6)
		{
			this.right = right;
		}
	}
	
	public int getLeft()
	{
		return left;
	}
	
	public  int getRight()
	{
		return right;
	}
	
	public DominoTile(int left, int right)
	{
		setLeft(left);
		setRight(right);
	}
	
	public DominoTile()
	{
		this(0, 0);
	}
	
	private String firstRow(int value)
	{
		String result = "";
		if(value >= 2)
		{
			result += "* ";
		}
		else
		{
			result += "  ";
		}
		if(value >= 4)
		{
			result += "*";
		}
		else
		{
			result += " ";
		}
		return result;
	}
	
	private String secondRow(int value)
	{
		String result = "";
		if(value == 6)
		{
			result += "*";
		}
		else
		{
			result += " ";
		}
		if(value%2 == 1)
		{
			result += "*";
		}
		else
		{
			result += " ";
		}
		if(value == 6)
		{
			result += "*";
		}
		else
		{
			result += " ";
		}
		return result;
	}
	
	String thirdRow(int value)
	{
		String result = "";
		if(value >= 4)
		{
			result += "* ";
		}
		else
		{
			result += "  ";
		}
		if(value >= 2)
		{
			result += "*";
		}
		else
		{
			result += " ";
		}
		return result;
	}
	
	public void reverse()
	{
		int temp = getLeft();
		setLeft(getRight());
		setRight(temp);
	}

	public String toString() 
	{
		String result = "";
		result += firstRow(left);
		result += "|";
		result += firstRow(right);
		result += "\n";
		result += secondRow(left);
		result += "|";
		result += secondRow(right);
		result += "\n";
		result += thirdRow(left);
		result += "|";
		result += thirdRow(right);
		return result;
	}
}
