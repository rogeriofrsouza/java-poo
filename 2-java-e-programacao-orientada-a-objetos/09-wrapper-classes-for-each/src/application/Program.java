package application;

public class Program {

	public static void main(String[] args) {
		
		// 1. Wrapper classes
		int x = 20;
		
		/*
		 *  Object obj = x;  // Classe mais genérica do Java, todas as classes são filhas dela
		 * 
		 *  int y = (int) obj;
		 */
		
		Integer obj = x;  // Equivalente a int: aceita valor null e recursos da POO
		
		int y = obj * 2;
		
		System.out.println(obj);
		System.out.println(y);
		// ----------------------
		
		Integer a = 10;
		
		int b = a * 2;
		// ----------------------
		
		// 2. Laço for each
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------");
		
		// Leitura: "para cada objeto 'nome' contido em vect, faça:
		for (String nome : vect) {
			System.out.println(nome);
		}

	}

}
