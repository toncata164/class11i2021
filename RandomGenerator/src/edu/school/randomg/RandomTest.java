package edu.school.randomg;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		int [] numbers = new int[] {1,3,4,6,7,8,9,11,12,13};
		Random r = new Random();
		System.out.println(numbers[r.nextInt(numbers.length)]);
	}

}
