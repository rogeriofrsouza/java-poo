package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));
		
		// Percorre a coleção e executa um Consumer para cada elemento
		
		// 1. Interface funcional
//		list.forEach(new PriceUpdate());
		
		// 2. Method reference static
//		list.forEach(Product::staticPriceUpdate);
		
		// 3. Method reference non static
//		list.forEach(Product::nonStaticPriceUpdate);
		
		// 4. Expressão lambda declarada
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
//		
//		list.forEach(cons);
		
		// 5. Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);  // Reference method para o println (Consumer)
	}

}
