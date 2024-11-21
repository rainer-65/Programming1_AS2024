package lecture04.exercises;

public class Product {
	public enum ProductType { electronics, food, clothes };
	
	private final int ID;
	private String name;
	private ProductType productType;
	private int price;
	private int inventory;

	public Product(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 3) this.name = name;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0) this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		if (inventory > 0) this.inventory = inventory;
	}

	public int getID() {
		return ID;
	}

}
