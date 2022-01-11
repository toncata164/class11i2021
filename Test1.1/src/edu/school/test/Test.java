package edu.school.test;

public class Test {
	public static void main(String[] args)
	{
		try
		{
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza("English Breakfast",PizzaSize.MEDIUM, 
				Product.ONION,
				Product.BACON,
				Product.EGG);
		Pizza p3 = new Pizza("Vegetarian", PizzaSize.MEDIUM,
				Product.TOMATOES,
				Product.CHEESE,
				Product.OLIVES,
				Product.PEPPER);
		Pizza p4 = new Pizza("Peperoni", PizzaSize.LARGE,
				Product.PEPPERONI,
				Product.PEPPER,
				Product.TOMATOES);
		
		}catch(Exception r)
		{
			System.out.println("Exception catched!");
		}
		
		
		/*PizzaFilter filter = new PizzaFilter(p1,p2,p3,p4);
		for(Pizza p :filter.filter())
		{
			if(p != null)
				System.out.println(p);
		}
		System.out.println();
		filter.setContains(true);
		filter.addProducts(Product.ONION, Product.BACON);
		for(Pizza p :filter.filter())
		{
			if(p != null)
				System.out.println(p);
		}
		System.out.println();
		
		filter.setContains(false);
		for(Pizza p :filter.filter())
		{
			System.out.println(p);
		}*/
	}
}
