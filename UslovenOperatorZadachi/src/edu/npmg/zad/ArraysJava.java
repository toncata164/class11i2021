package edu.npmg.zad;

public class ArraysJava {
	
	public static void changeArray(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] += 20;
		}
	}
	
	public static int sumOfElements(int arr[])
	{
		int sum = 0;
		for(int current : arr)
		{
			sum+=current;
		}
		return sum;
	}
	
	public static void changeInt(int current)
	{
		current+=20;
	}

	public static void main(String[] args) {
		
		String[] myArray = new String[3];
		myArray[0] = "first element";
		myArray[1] = new String("first element");
		myArray[2] = String.format("first elem%cnt", 'e');
		
		int[] numbers = new int[] {1,19,803,-4};
		/*for(int i = 0; i<numbers.length; i++)
		{
			numbers[i]++;
		}*/
		System.out.println(sumOfElements(numbers));
		
		/*
		for(int current:numbers)
		{
			current++;
			System.out.println(current);
		}
		*/
		/*for(int i = 0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}*/
		
		for(int current : numbers)
		{
			System.out.println(current);
		}
		
		System.out.println(numbers.length);
		
		
		//Да се напише програма, която въвежда едно цяло положително 
		//число Н, едно положително число К и след това Н на брой
		//цели положителни числа. Програмата да казва колко пъти
		//числото К се съдържа измежду Н-те въведени числа
		
		//Да се напише програма, която въвежда едно цяло положително число
		//Н, след това въвежда Н на брой цели положителни числа
		//и след това число К. Програмата да казва колко пъти
		//числото К се съдържа измежду Н-те въведени числа
		
		
		

	}

}
