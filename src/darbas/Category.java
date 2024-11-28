package darbas;

import java.util.ArrayList;

public class Category {
	
	private String name;
	ArrayList<Product> products = new ArrayList<>();
	
	public Category(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addProduct(Product prod)
	{
		products.add(prod);
	}
	
	public ArrayList<Product> returnProducts()
	{
		return products;
	}
	
}
