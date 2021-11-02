package edu.npmg.zad;

public class Loop {

	//1. Vuvejda se cqlo chislo i se namira broqt na negovite cifri
	//2. Vuvejda se cqlo chislo i se namira proizvedenieto na
	//chetnite mu cifri
	//3. Vuvejda se cqlo polojitelno chislo i se namira dali chisloto e
	//prosto ili ne
	//4. Vuvejdat se celi polojitelni chisla dokato ne se 
	//vuvede nula ili otricatelno, programata da izvejda sredno 
	//aritmetichnoto na chislata
	//5. Vuvejda se cqlo chislo. Programata namira nay-malkata mu cifra
	
	//6. Vuvejda se cqlo chislo. Programata proverqva dali chisloto e
	//palindrom
	//7. Vuvejda se cqlo chislo. Programata namira nay malkoto chislo
	//koeto se poluchava ako mejdu cifrite na chisloto se postavqt
	//znacite + ili *
	
	
	
	
	
	public static void main(String[] args) {
		int start = 1;
		while(start++ <= 100)
		{
			System.out.print(start+" ");
		}
		int end = 100;
		do
		{
			System.out.print(end--+" ");
		}while(end>=0);
		
		System.out.println();
		int a;
		for(a = 8;a<10;a++)
		{
			System.out.print("8");
		}
		System.out.println(a);
	}

}
