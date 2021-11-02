package edu.npmg.zad;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		/*
		 * Vuvejdat se 3 chisla, programata da gi izkara
		 * podredeni po golemina
		 */
		Scanner input = new Scanner(System.in);
		int a, b, c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a > b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		if(b > c)
		{
			int temp = b;
			b = c;
			c = temp;
		}
		if(a > b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.printf("Podredeni chislata sa: %d %d %d", a, b, c);
	}

}
