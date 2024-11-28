package darbas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		
//		manager.addCategory(new Category("computer"));
//		manager.addCategory(new Category("food"));
//		
//		manager.addProductToCategory("computer", new Product("moniter", 100.50));
//		manager.addProductToCategory("computer", new Product("mouse", 125.50));
//		
//		manager.addProductToCategory("food", new Product("hamburger", 20.50));
//		manager.addProductToCategory("food", new Product("Goldhamburger", 120.50));
//		
////		manager.searchProduct("moniter");
////		
////		manager.filterProductsByCategory("computer");
////		
////		manager.filterByPrice(30, 150);
//		
////		manager.sortByPriceProducts("a");
//		
//		manager.showEverything();
		
		Scanner input = new Scanner(System.in);
		
		int nr = 0;
		
		while(nr != 8)
		{
			System.out.println("1. Prideti kategorija");
			System.out.println("2. Prideti preke");
			System.out.println("3. Ieskoti prekiu pagal pavadinima");
			System.out.println("4. Filtruoti prekes pagal kategorija");
			System.out.println("5. Filtruoti prekes pagal kaina");
			System.out.println("6. Rusioti prekes pagal kaina");
			System.out.println("7. Rodyti visas prekes");
			System.out.println("8. Iseiti");
			System.out.println(" ");
			System.out.println("Pasirinkite veiksma: ");
			
			nr = input.nextInt();
			
			input.nextLine();
			
			if (nr == 1)
			{
				String newcat;
				
				System.out.println("Iveskite nauja ketegorija: ");
				
				newcat = input.nextLine();
				
				manager.addCategory(new Category(newcat));
			}
			else if (nr == 2)
			{
				String cat;
				String prod;
				
				double kaina;
				
				System.out.println("Iveskite ketegorija: ");
				cat = input.nextLine();
				
				System.out.println("Iveskite produkta: ");
				prod = input.nextLine();
				
				
				System.out.println("Iveskite produkto kaina: ");
				kaina = input.nextDouble();
				
				input.nextLine();
				
				
				manager.addProductToCategory(cat, new Product(prod, kaina));
				
			}
			else if (nr == 3)
			{
				String prod;
				
				System.out.println("Iveskite produkta: ");
				prod = input.nextLine();
				
				manager.searchProduct(prod);
				
			}
			else if (nr == 4)
			{
				String cat;
				
				System.out.println("Iveskite ketegorija: ");
				cat = input.nextLine();
				
				manager.filterProductsByCategory(cat);
				
			}
			else if (nr == 5)
			{
				double min;
				double max;
				
				System.out.println("Iveskite min: ");
				min = input.nextDouble();
				
				input.nextLine();
				
				System.out.println("Iveskite max: ");
				max = input.nextDouble();
				
				input.nextLine();
				
				manager.filterByPrice(min, max);
				
			}
			else if (nr == 6)
			{
				
				String type;
				
				System.out.println("Iveskite [d/a]: ");
				type = input.nextLine();
				
				
				manager.sortByPriceProducts(type);
			}
			else if (nr == 7)
			{
				manager.showEverything();
			}
			
		}
		
		System.out.println("Viskas.");
		
		
		
		

	}

}
