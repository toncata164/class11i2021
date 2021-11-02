package edu.npmg.wargame;

public class Card {

	private int power;
	private int color;
	
	public Card() //default constsructor, creates 2 of clubs
	{
		power = 0;
		color = 0;
	}
	
	public Card(int cardValue) //constructor that creates a card from number in [0, 51] 
	{
		this();
		if(cardValue >= 0 && cardValue <= 51)
		{
			setColor(cardValue%4);
			setPower(cardValue/4);
		}
	}
	
	public Card(int power, int color) //constructor that creates a card by its power and color
	{
		setColor(color);
		this.power = power;
	}
	
	public void setColor(int colorValue)
	{
		if(colorValue >= 0 && colorValue <= 3)
		{
			color = colorValue;
		}
	}
	
	public void setPower(int powerValue)
	{
		if(powerValue < 0 || powerValue > 12)
		{
			return;
		}
		power = powerValue;
	}
	
	public int getColor()
	{
		return color;
	}
	
	public int getPower()
	{
		return power;
	}
 	
	public String toString()
	{
		int newPower = getPower()+2;
		String toReturn = "";
		if(newPower <= 10)
		{
			toReturn += newPower + " ";
		}
		else
		{
			if(newPower == 11)
			{
				toReturn += "J ";
			}
			if(newPower == 12)
			{
				toReturn += "Q ";
			}
			if(newPower == 13)
			{
				toReturn += "K ";
			}
			if(newPower == 14)
			{
				toReturn += "A ";
			}
		}
		toReturn += "of ";
		if(getColor() == 0)
		{
			toReturn += "clubs";
		}
		else if(getColor() == 1)
		{
			toReturn += "diamonds";
		}
		else if(getColor() == 2)
		{
			toReturn += "hearts";
		}
		else
		{
			toReturn += "spades";
		}
		return toReturn;
	}
}
