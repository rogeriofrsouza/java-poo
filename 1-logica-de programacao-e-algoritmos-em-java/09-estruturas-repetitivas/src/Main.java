import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  1. Estrutura repetitiva "enquanto"
		 *  Recomendada quando não se sabe previamente a qtde de repetições
		 */
		int num = 1, soma = 0;
		
		while (num != 0) {
			num = sc.nextInt();
			soma += num;
		}
		
		System.out.println("Soma: " + soma);
		// -----------------------
		
		/*
		 *  2. Estrutura repetitiva "para"
		 *  Recomendada quando se sabe previamente a qtde de repetições
		 *  Ótima para contagens (progressiva e regressiva)
		 */
		int n, sum = 0; 
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}
		
		System.out.println("Soma: " + sum);
		// -----------------------
		
		/*
		 * 3. Estrutura repetitiva "faça-enquanto"
		 * O bloco é executado pelo menos uma vez
		 */
		double c, f;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			
			f = (9.0 * c / 5.0) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			
			System.out.print("Deseja repetir [s/n]? ");
			resp = sc.next().charAt(0);			
		} while (resp != 'n');

		sc.close();
	}

}
