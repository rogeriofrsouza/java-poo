package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Product;

public class Program {

	public static int globalValue = 3;

	public static void main(String[] args) {

		int[] vect = new int[] { 3, 4, 5 };

		/*
		 * O comportamento desta função depende de um valor externo 
		 * Não possui transparência referencial 
		 * Mais difícil de entender do que uma função que depende dos seus próprios valores
		 */
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
		System.out.println();
		// ---------------------------------------

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/*
		 * Funções são objetos de primeira ordem (ou primeira classe)
		 * Podem ser passadas como argumento de outra função e podem ainda ser retornadas por esta função
		 */
		list.sort(Program::compareProducts);
		list.forEach(System.out::println);
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
}
