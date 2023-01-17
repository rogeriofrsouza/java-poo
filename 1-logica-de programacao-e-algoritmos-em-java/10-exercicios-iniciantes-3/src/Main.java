import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 1. Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		 */
		System.out.println("Exercício 1");
		
		int senha;
		
		while (true) {
			System.out.print("Senha: ");
			senha = sc.nextInt();
			
			if (senha == 2002)
				break;
			
			System.out.println("Senha inválida");
		}
		
		System.out.println("Acesso permitido\n");
		// ---------------------------
		
		/*
		 * 2. Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		 */
		System.out.println("Exercício 2");
		
		int x, y;
						
		while (true) {
			System.out.print("Informe as coordenadas: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x == 0 || y == 0)
				break;
			
			if (y > 0 && x > 0) {
				System.out.println("Primeiro");				
			}
			else if (y > 0 && x < 0) {
				System.out.println("Segundo");				
			}
			else if (y < 0 && x < 0) {
				System.out.println("Terceiro");				
			}
			else {
				System.out.println("Quarto");				
			}
		}
		// ---------------------------
		
		/*
		 * 3. Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
		 */
		System.out.println("\nExercício 3");
		
		int opcao, alcool = 0, gasolina = 0, diesel = 0;

		do {	
			System.out.println("\n*POSTO GASOLINA BARATA*");
			System.out.println("[1] Álcool");
			System.out.println("[2] Gasolina");
			System.out.println("[3] Diesel");
			System.out.println("[4] Sair");
			System.out.print("Informe o tipo de combustível: ");
			
			while (true) {
				opcao = sc.nextInt();
				
				if (opcao >= 1 && opcao <= 4)
					break;
			}
			
			switch (opcao) {
				case 1: 
					alcool++; break;
				case 2:
					gasolina++; break;
				case 3:
					diesel++; break;
			}
		} while (opcao != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
