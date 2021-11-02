package edu.npmg.wargame;

public class CardTest {

	public static void main(String[] args) {
		Card firstCard = new Card();
		//firstCard.setColor(3);
		
		Card secondCard = new Card(3, 2);//5 of spades
	
		
		System.out.println(firstCard);
		System.out.println(secondCard);
	}

}
