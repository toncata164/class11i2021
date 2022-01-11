package edu.school.test;

public class PizzaFilter {
	private Pizza[] pizzas;
	private boolean contains;
	private Product[] products;
	private int index;
	
	public PizzaFilter(Pizza...pizzas)
	{
		this.pizzas = pizzas;
		index = 0;
	}
	
	public void setContains(boolean contains)
	{
		this.contains = contains;
	}
	
	public boolean contains()
	{
		return contains;
	}
	
	public void addProduct(Product product) throws Exception
	{
		if(products == null)
			products = new Product[Product.values().length];
		if(index >= products.length)
			throw new Exception("Products array is full!");
		for(int i = 0; i<index; i++)
			if(products[i].equals(product))
				return;
		products[index++] = product;
	}
	
	public void addProducts(Product...products)
	{
		for(Product p : products)
		{
			try
			{
				addProduct(p);
				index++;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			index--;
			
		}
	}
	
	public Pizza[] filter()
	{
		if(index == 0)
		{
			return pizzas;
		}
		
		Pizza[] p = new Pizza[pizzas.length];
		int k = 0;
		for(Pizza pi : pizzas)
		{
			for(int i = 0; i<index; i++)
			{
				boolean exists = false;
				for(int q = 0; q < k; q++)
				{
					if(p[q] == pi)
					{
						exists = true;
						break;
					}
				}
				if(!exists)
				{
					if(contains && pi.contains(products[i]))
					{
						p[k++] = pi;
						break;
					}
					if(!contains && !pi.contains(products[i]))
					{
						p[k++] = pi;
						break;
					}
				}
			}
		}
		return p;
	}
}
