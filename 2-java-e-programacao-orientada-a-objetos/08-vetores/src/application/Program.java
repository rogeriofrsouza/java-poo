package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double sum, avg;
		
		// Problema exemplo 1: vetor de elementos tipo valor (tipo primitivo)
		n = sc.nextInt();
		double[] vect = new double[n];  // instancia um vetor com n elementos na área de memória Heap
		
		for (i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();  // Acesso aos elementos do vetor
		}
		
		sum = 0.0;
		
		for (i = 0; i < n; i++) {
			sum += vect[i];			
		}
		
		avg = sum / n;		
		System.out.printf("Average height: %.2f%n%n", avg);
		// ----------------------------------

		// Problema exemplo 2: vetor de elementos tipo referência (classe)
		n = sc.nextInt();
		Product[] products = new Product[n];  // Instancia um vetor de elementos ponteiros no Heap, com valor padrão null
		
		// Usar o .length para não depender de uma variável auxiliar. O próprio vetor sabe o tamanho dele.
		for (i = 0; i < products.length; i++) {
			sc.nextLine();  // Consome a quebra de linha pendente do nextInt() da linha 37
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			products[i] = new Product(name, price);  // Elemento i do vetor aponta para o objeto produto
		}
		
		sum = 0.0;
		
		for (i = 0; i < products.length; i++) {
			sum += products[i].getPrice();
		}
		
		avg = sum / products.length;
		System.out.printf("Average price: $%.2f%n", avg);
		
		sc.close();
	}

}
