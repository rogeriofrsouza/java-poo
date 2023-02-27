package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		// Lento mas 100% correto
		System.out.println(a.equals(b));
		
		/*
		 * Muito rápido de ser calculado, mas com chance de colisão
		 * Números inteiros são limitados a 32 bits, podendo gerar hashCodes iguais em objetos diferentes
		 * Se o hashCode for diferente, os dois objetos são diferentes. O mesmo objeto nunca gera códigos diferentes
		 */
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();
		// ------------------------------
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		// Client -> Compara as referências de memória
		System.out.println(c1 == c2);
		System.out.println(s3 == s4);
		
		// String -> Compara o conteúdo, tratamento especial para expressão literal
		System.out.println(s1 == s2);
		
	}

}
