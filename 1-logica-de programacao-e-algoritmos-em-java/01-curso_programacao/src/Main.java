import java.util.Locale;  // Importa a classe Locale dentro do programa

public class Main {

	public static void main(String[] args) {
		
		// Entry point da aplicação: onde a execução do programa começa
		System.out.println("Olá mundo!");
		System.out.println("Bom dia");
		
		// Cria uma área na memória RAM com nome e valor especificado
		int y = 32;
		double x = 10.35784;
		
		// Comandos de saída de dados (Escrita)
		System.out.println(y);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);  // Escrita formatada - %n ou \n (quebra de linha)
		
		Locale.setDefault(Locale.US);  // Configura a localização para US
		
		System.out.println("Resultado = " + x + " metros");  // Concatenando elementos
		System.out.printf("Resultado = %.2f metros%n", x);  // Concatenando com formato - %f
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		// Impressão com vários valores interpolados na string
		System.out.printf("%s tem %d anos e ganha R$%.2f", nome, idade, renda);
	}

}
