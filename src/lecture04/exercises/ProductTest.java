package lecture04.exercises;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int ID = in.nextInt();
		System.out.println("Enter the product name: ");
		String name = in.nextLine();
		System.out.println("Enter the product type: ");
		String typeString = in.nextLine();
		System.out.println("Enter the price in rappen (cents): ");
		int price = in.nextInt();
		System.out.println("Enter the inventory: ");
		int inventory = in.nextInt();
		in.close();

		Product prod = new Product(ID);
		prod.setName(name);
		prod.setPrice(price);
		prod.setInventory(inventory);
		Product.ProductType type = Product.ProductType.electronics;
		if (typeString.equals("food")) type = Product.ProductType.food;
		else if (typeString.equals("clothes")) type = Product.ProductType.clothes;
		prod.setProductType(type);
		
		System.out.println("Product information follows:");
		System.out.println("ID: " + prod.getID());
		System.out.println("name: " + prod.getName());
		System.out.println("type: " + prod.getProductType());
		System.out.println("price: " + prod.getPrice());
		System.out.println("inventory: " + prod.getInventory());
	}

}
