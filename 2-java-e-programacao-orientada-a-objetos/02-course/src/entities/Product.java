package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;  // this: auto referência para o objeto
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// Sobrepondo a operação toString() padrão do Object
	public String toString() {
		return name 
			+ ", $" 
			+ String.format("%.2f", price) 
			+ ", " 
			+ quantity 
			+ " units, Total: $" 
			+ String.format("%.2f", totalValueInStock());
	}

}
