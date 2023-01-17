import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Estruturas de controle
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  // Ctrl + Shift + O = import classes
		
		// 1. Estrutura condicional simples
		int x = 5;
		
		System.out.println("Bom dia");
		
		// Chaves são opcionais em blocos com apenas um comando
		if (x < 0)
			System.out.println("Boa tarde");  // Endentação do bloco de comandos
		// -----------------------------
		
		// 2. Estrutura condicional composta
		int hora;
		
		System.out.print("Quantas horas? ");
		hora = sc.nextInt();
		
		if (hora < 12)
			System.out.println("Bom dia");
		else
			System.out.println("Boa tarde");
		// -----------------------------
		
		// Encadeamento de estruturas condicionais		
		int hora2;
		
		System.out.print("Quantas horas? ");
		hora2 = sc.nextInt();
		
		if (hora2 < 6) {
			System.out.println("Boa madrugada");
		} 
		else if (hora2 < 12) {
			System.out.println("Bom dia");
		} 
		else if (hora2 < 18) {
			System.out.println("Boa tarde");				
		} 
		else {
			System.out.println("Boa noite");
		}
		// -----------------------------
		
		// Operadores de atribuição cumulativa (sintaxe opcional)
		/*
		 * a += b
		 * a -= b
		 * a *= b
		 * a /= b
		 * a %= b
		 */
		int minutos;
		double conta = 50.0;
		
		System.out.print("Informe minutos: ");
		minutos = sc.nextInt();
				
		if (minutos > 100)
			conta += (minutos - 100) * 2.0;
		
		System.out.printf("Valor da conta: R$%.2f%n", conta);
		// -----------------------------
		
		// Estrutura switch-case (sintaxe opcional)
		int num;
		String dia;
		
		System.out.print("Informe o dia: [1 - Domingo] ... [7 - Sábado] ");
		num = sc.nextInt();
		
		// Avalia a expressão num
		switch (num) {
			case 1:
				dia = "Domingo"; break;
			case 2:
				dia = "Segunda-feira"; break;
			case 3:
				dia = "Terça-feira"; break;
			case 4:
				dia = "Quarta-feira"; break;
			case 5:
				dia = "Quinta-feira"; break;
			case 6:
				dia = "Sexta-feira"; break;
			case 7:
				dia = "Sábado"; break;
			default:
				dia = "Valor inválido"; break;  // Valor padrão caso as alternativas anteriores falhem
		}
		
		System.out.println("Dia da semana: " + dia);
		// -----------------------------
		
		// Expressão condicional ternária (sintaxe opcional)
		double preco = 34.5;
		double desconto = (preco <= 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Preço: R$%.2f | Desconto: R$%.2f%n", preco, desconto);
		// -----------------------------
		
		// Escopo e inicialização (nível de estrutura de controle)
		double price = 400.0;
		double discount;
		
		if (price < 200.0) {
			// int id = 30; // Esta variável seria desalocada da memória após execução do bloco
			
			discount = price * 0.1;
		}
		else {
			discount = 0.0;
		}
		
		System.out.println(discount);
		
		sc.close();
	}

}
