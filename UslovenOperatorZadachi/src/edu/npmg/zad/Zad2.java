package edu.npmg.zad;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vuvejdat se 4 chisla, programata izvejda vtoroto po golemina
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int max = a;
		int preMax = b;
		if(max < b)
		{
			max = b;
			preMax = a;
		}
		
		if(max != preMax)
		{
			a = input.nextInt();
			if(a > preMax && a < max)
			{
				preMax = a;
			}
			else if(a > max)
			{
				preMax = max;
				max = a;
			}
			a = input.nextInt();
			if(a > preMax && a < max)
			{
				preMax = a;
			}
			else if(a > max)
			{
				preMax = max;
				max = a;
			}
		
		}
		else
		{
			a = input.nextInt();
			if(a > max)
			{
				max = a;
			}
			else if(a < max)
			{
				preMax = a;
			}
			
			if(max == preMax)
			{
				a = input.nextInt();
				if(a > max)
				{
					max = a;
				}
				else if(a < max)
				{
					preMax = a;
				}
			}
			else
			{
				a = input.nextInt();
				if(a > preMax && a < max)
				{
					preMax = a;
				}
				else if(a > max)
				{
					preMax = max;
					max = a;
				}
			}
		}
		if(max == preMax)
		{
			System.out.println("No such number!");
		}
		else
		{
			System.out.println(preMax);
		}
	}

}
