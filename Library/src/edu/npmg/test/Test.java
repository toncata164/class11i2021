package edu.npmg.test;

import edu.npmg.library.Book;
import edu.npmg.library.ReaderProfile;

public class Test {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Programirane = ++Algoritmi", "Preslav Nakov",
				"Arhimed", "123487651234");
		System.out.println(b1);
		System.out.println(b2);
				
		ReaderProfile p1 = new ReaderProfile("Anton", "Ivanov",
				10, 'b', "+359888666321", new Book[] {b1, b2});		
			
		System.out.println(p1);
	}

}
