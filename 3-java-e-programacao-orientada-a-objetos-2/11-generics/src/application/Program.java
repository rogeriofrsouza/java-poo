package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		/*
		 * Problema motivador: Generics
		 * 1- Reuso -> Não é necessário criar uma classe para cada tipo
		 * 2- Type safety -> Evita o uso da classe Object 
		 * 3- Performance -> Não necessita de casting/boxing/unboxing
		 */
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();  // Instancia um service do tipo específico
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

}
