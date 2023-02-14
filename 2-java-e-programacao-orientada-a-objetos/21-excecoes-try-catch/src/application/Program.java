package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Aplicações comerciais não terminam quando ocorre uma Exception
		 * Esta Exception deve ser capturada/tratada e exbir uma mensagem de erro para o usuário
		 * 
		 * Em Java, quando a exceção não é tratada, o programa termina e aparece o Stack Trace no console
		 */
		method1();
		
		System.out.println("End of program");
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");  // Marcador
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		// Bloco de código de execução normal e que pode gerar uma Exception
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		// Bloco de código a ser executado caso uma exceção ocorra. Deve especificar o tipo da exceção (permite upcasting)
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			
			e.printStackTrace();  // Imprime na tela todas as chamadas de métodos que acarretaram na exceção
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		
		System.out.println("***METHOD2 END***");
	}

}
