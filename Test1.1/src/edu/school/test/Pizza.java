package edu.school.test;

public class Pizza {
	private Product[] products;
	private int index;
	private PizzaSize size;
	private String name;
	
	public Pizza()
	{
		index = 0;
		products = new Product[2];
		addProduct(Product.TOMATO_JUICE);
		addProduct(Product.YELLOW_CHEESE);
		size = PizzaSize.SMALL;
		name = "Margarita";
	}
	
	public Pizza(String name, PizzaSize size, Product...products)
	{
		this();
		setSize(size);
		setName(name);
		addProducts(products);
	}
	
	public void addProduct(Product product)
	{
		if(index >= products.length)
			throw new RuntimeException("No more space!");
		for(int i = 0; i<index; i++)
			if(products[i].equals(product))
				return;
		products[index++] = product;
	}
	
	public void addProducts(Product...products)
	{
		for(Product p : products)
			addProduct(p);
	}
	
	public boolean contains(Product p)
	{
		for(int i = 0; i<index; i++)
			if(p.equals(products[i]))
				return true;
		return false;
	}
	
	public Product[] getProducts() {
		return products;
	}
	
	public PizzaSize getSize() {
		return size;
	}
	public void setSize(PizzaSize size) {
		this.size = size;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{	
		String result = "Pizza "+getName()+"\n";
		result += "Size: "+size+"\n";
		result += "Ingredients: ";
		for(int i = 0; i<index; i++)
		{
			result += products[i]+" ";
		}
		return result;
	}
	
}
