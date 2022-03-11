package edu.school.datastructures.tests;

import edu.school.datastructures.ArrayList;
import edu.school.datastructures.LinkedList;
import edu.school.datastructures.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(8);
		list.add(19);
		list.add(881);
		list.add(0);
		list.removeAt(3);
		list.add(1);
		list.removeAt(0);
		list.insertAt(0, 12);
		list.remove(19);
		list.remove(165);
		list.remove(12);
		list.removeAt(18);
		
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

}
