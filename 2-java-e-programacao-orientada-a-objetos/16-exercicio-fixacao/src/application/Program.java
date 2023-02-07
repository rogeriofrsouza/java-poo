package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido. 
		 * Nota: o instante do pedido deve ser o instante do sistema.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data");
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
				
		Order order = new Order(LocalDateTime.now(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
				
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data");
			
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price: $");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, productPrice, product);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		sc.close();

	}

}
