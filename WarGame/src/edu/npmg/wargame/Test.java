package edu.npmg.wargame;

import java.util.Random;

public class Test {

	static int deck[] = new int[52];
	
	static int player1[] = new int[52];
	static int player2[] = new int[52];
	
	static int p1Last = deck.length/2;
	static int p2Last = p1Last;
	
	public static void drawCards()
	{
		int half = deck.length/2;
		for(int i = 0; i<half; i++)
		{
			player1[i] = deck[i];
		}
		for(int i = 0; i<half; i++)
		{
			player2[i] = deck[i+half];
		}
	}
	
	public static void initDeck()
	{
		for(int i = 0; i<deck.length; i++)
		{
			deck[i] = i;
		}
	}
	
	public static void shuffleDeck()
	{
		Random rand = new Random();
		for(int i = 0; i<deck.length; i++)
		{
			int index = rand.nextInt(deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
	}
	
	public static void printDeck(int[] cards, int len)
	{
		for(int i = 0; i<len; i++)
		{
			System.out.print(cards[i]+" ");
		}
	}
	
	public static int power(int card)
	{
		return card/4;
	}
	
	public static void putCardsOnTable(int[] winner, 
			int[] looser, int winnerLast, int looserLast)
	{
		for(int i = 0; i<looserLast-1; i++)
		{
			looser[i] = looser[i+1];
		}
		
		for(int i = 0; i<winnerLast-1; i++)
		{
			winner[i] = winner[i+1];
		}
	}
	
	public static void play()
	{
		while(p1Last != 0 && p2Last != 0)
		{
			int p1Card = player1[0];
			int p2Card = player2[0];
			
			System.out.printf("Player1: %d Player2: %d\n", p1Card, p2Card);
			
			if(power(p1Card) > power(p2Card))
			{
				
				putCardsOnTable(player1, player2, p1Last, p2Last);
				p1Last--;
				player1[p1Last++] = p1Card;
				player1[p1Last++] = p2Card;
				p2Last--;
				
				printDeck(player1, p1Last);
				System.out.println();
				printDeck(player2, p2Last);
				System.out.println();
			}
			else if(power(p1Card) < power(p2Card))
			{
				
				putCardsOnTable(player2, player1, p2Last, p1Last);
				p2Last--;
				player2[p2Last++] = p2Card;
				player2[p2Last++] = p1Card;
				p1Last--;
				
				printDeck(player2, p2Last);
				System.out.println();
				printDeck(player1, p1Last);
				System.out.println();
			}
			else
			{
				//war
				return;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		initDeck();
		shuffleDeck();
		//printDeck();
		drawCards();
		play();
	}

}
