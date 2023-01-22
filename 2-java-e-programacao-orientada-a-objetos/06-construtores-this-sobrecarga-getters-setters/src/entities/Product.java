package entities;

public class Product {
	
	/* 1. Encapsulamento de atributos - Convenção JavaBeans */
	private String name;
	private double price;
	private int quantity;
	
	/* 2. Construtor padrão: não possui tipo de retorno, é executado no momento da instanciação do objeto */
	public Product() {
	}
	
	/*
	 * 3. Construtores personalizados
	 * Convenção: parâmetros com os mesmos nomes dos atributos
	 */
	public Product(String name, double price, int quantity) {
		this.name = name;  // this: diferencia atributos de variáveis locais
		this.price = price;
		this.quantity = quantity;
	}
	
	// Sobrecarga: outra versão do método construtor, porém, com uma lista de parâmetros diferente
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// opcional atribuir zero para quantity e usar palavra this
	}
	
	/* 4. Métodos getters e setters */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;  // quantity não terá o método set, por questão de consistência e regra de negócio (entrada e saída no estoque)
	}

	/* 5. Outros métodos/operações */
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

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
