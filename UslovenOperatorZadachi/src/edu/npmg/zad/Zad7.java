package edu.npmg.zad;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		boolean hasZero = false;
		int numberCopy = number;
		while(number != 0)
		{
			if(number%10 == 0)
			{
				hasZero = true;
				break;
			}
			number = number / 10;
		}
		number = numberCopy;
		
		if(hasZero)
		{
			System.out.println(0);
			return;
		}
		else
		{
			boolean hasNeighborOnes = false;
			int lastDigit = number%10;
			number = number / 10;
			while(number != 0)
			{
				if(lastDigit == 1 && number%10 == 1)
				{
					hasNeighborOnes = true;
					break;
				}
				lastDigit = number%10;
				number = number / 10;
			}
			
			number = numberCopy;
			
			if(hasNeighborOnes)
			{
				int newNumber = 0;
				while(number != 0)
				{
					int digit = number%10;//cifrata na edinicite na number
					if(digit == 1 && newNumber%10 == 1)
					{
						number = number/10;
						continue;
					}
					newNumber = newNumber*10 + digit;
					number = number/10;
				}
				number = newNumber;
			}
			
			if(number == 1)
			{
				System.out.println(1);
				return;
			}
			
			int sum = 0;
			while(number!=0)
			{
				if(number%10 != 1)
				{
					sum += number%10;
				}
				number /= 10;
			}
			System.out.println(sum);
		}
	}

}
