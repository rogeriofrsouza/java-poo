package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));
		
		/*
		 * Aplica uma função para cada elemento de uma stream (sequência de dados)
		 * Conversões: List para Stream e Stream para List
		 * Produz uma nova lista
		 */
		
		// 1. Interface funcional
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		// 2. Method reference static
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		// 3. Method reference non static
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		// 4. Expressão lambda declarada
//		Function<Product, String> func = p -> p.getName().toUpperCase();
//		
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		// 5. Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
