package darbas;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
	
	private ArrayList<Category> categorys = new ArrayList<>();
	
	public void addCategory(Category cat)
	{
		categorys.add(cat);
	}
	
	public void addProductToCategory(String catname, Product prod)
	{
		
		for (int i = 0; i < categorys.size(); i++)
		{
			if (categorys.get(i).getName().equals(catname))
			{
				categorys.get(i).addProduct(prod);
			}
		}
		
	}
	
	public void searchProduct(String name)
	{
		for (int i = 0; i < categorys.size(); i++)
		{
			ArrayList<Product> products = categorys.get(i).returnProducts();
			
			for (int j = 0; j < products.size(); j++)
			{
				if (products.get(j).getName().equals(name))
				{
					products.get(j).displayInfo();
				}
			}
		}
	}
	
	public void filterProductsByCategory(String catname)
	{
		ArrayList<Product> products;
		
		for (int i = 0; i < categorys.size(); i++)
		{
			if (categorys.get(i).getName().equals(catname))
			{
				products = categorys.get(i).returnProducts();
				
				System.out.println("+-------------------+------------+");
				System.out.println("| Product           | Price      |");
				System.out.println("+-------------------+------------+");
				
				for(int j = 0; j < products.size(); j++)
				{
					System.out.print("| ");
					System.out.print(String.format("%-17s", products.get(j).getName()));
					System.out.print(" | ");
					System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
					System.out.println(" |");
				}
				
				System.out.println("+-------------------+------------+");
				
				return;
			}
		}
		
		System.out.println("Nieko nerasta");
	}
	
	public void filterByPrice(double minPrice, double maxPrice)
	{
		ArrayList<Product> products;
		
		for (int i = 0; i < categorys.size(); i++)
		{
			products = categorys.get(i).returnProducts();
			System.out.println("+-------------------+------------+");
			System.out.print("| ");
			System.out.print(String.format("%-30s", categorys.get(i).getName()));
			System.out.println(" |");
			System.out.println("+-------------------+------------+");
			System.out.println("| Product           | Price      |");
			System.out.println("+-------------------+------------+");
			
			for (int j = 0; j < products.size(); j++)
			{
				if (products.get(j).getPrice() > minPrice && products.get(j).getPrice() < maxPrice)
				{
					System.out.print("| ");
					System.out.print(String.format("%-17s", products.get(j).getName()));
					System.out.print(" | ");
					System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
					System.out.println(" |");
				}
				
			}
			System.out.println("+-------------------+------------+");
		}
		
		
	}
	
	public void sortByPriceProducts(String type)
	{
		ArrayList<Product> products;
		
		for (int i = 0; i < categorys.size(); i++)
		{
			products = categorys.get(i).returnProducts();
			
			if (type.equals("d"))
			{
				products.sort(Comparator.comparing(Product::getPrice).reversed());
			}
			else
			{
				products.sort(Comparator.comparing(Product::getPrice));
			}
			
			
			
			System.out.println("+-------------------+------------+");
			System.out.print("| ");
			System.out.print(String.format("%-30s", categorys.get(i).getName()));
			System.out.println(" |");
			System.out.println("+-------------------+------------+");
			System.out.println("| Product           | Price      |");
			System.out.println("+-------------------+------------+");
			
			for (int j = 0; j < products.size(); j++)
			{
				System.out.print("| ");
				System.out.print(String.format("%-17s", products.get(j).getName()));
				System.out.print(" | ");
				System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
				System.out.println(" |");
				
			}
			System.out.println("+-------------------+------------+");
		}
	}
	
	public void showEverything()
	{
		ArrayList<Product> products;
		
		for (int i = 0; i < categorys.size(); i++)
		{
			products = categorys.get(i).returnProducts();
			
			
			System.out.println("+-------------------+------------+");
			System.out.print("| ");
			System.out.print(String.format("%-30s", categorys.get(i).getName()));
			System.out.println(" |");
			System.out.println("+-------------------+------------+");
			System.out.println("| Product           | Price      |");
			System.out.println("+-------------------+------------+");
			
			for (int j = 0; j < products.size(); j++)
			{
				System.out.print("| ");
				System.out.print(String.format("%-17s", products.get(j).getName()));
				System.out.print(" | ");
				System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
				System.out.println(" |");
				
			}
			System.out.println("+-------------------+------------+");
		}
	}
}
