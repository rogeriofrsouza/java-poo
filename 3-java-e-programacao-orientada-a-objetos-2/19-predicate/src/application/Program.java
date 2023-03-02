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
		
		// 1. Implementação da interface funcional
//		list.removeIf(new ProductPredicate());
		
		// 2. Method reference -> Classe::method
//		list.removeIf(Product::staticProductPredicate);
		
		// 3. Method reference não estático
//		list.removeIf(Product::nonStaticProductPredicate);
		
		// 4. Expressão lambda declarada
//		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
//		
//		list.removeIf(pred);
		
		// 5. Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
