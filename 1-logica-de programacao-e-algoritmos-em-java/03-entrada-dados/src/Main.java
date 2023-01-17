import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Associando o objeto Scanner ao teclado no modo console
		Scanner sc = new Scanner(System.in);
	
		String x;
		x = sc.next();  // Comando de entrada de dados (uma palavra)
		
		// Snippet: sysout + CTRL + Espaço
		System.out.println("Você digitou: " + x);
		// --------------------------------------		
		
		int y;
		y = sc.nextInt();  // Comando de entrada para int
		
		System.out.println("Você digitou: " + y);
		// --------------------------------------		
		
		double z;
		z = sc.nextDouble();  // Localidade do sistema - Vírgula ou ponto
		
		System.out.println("Você digitou: " + z);
		// --------------------------------------		
		
		char a;
		a = sc.next().charAt(0);  // Lê o primeiro caracter da string
		
		System.out.println("Você digitou: " + a);
		// --------------------------------------		
		
		String b;
		int c;
		double d;
		
		// Lendo vários dados na mesma linha, separados por espaço
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.printf("Dados digitados: %s %d %f%n", b, c, d);
		// --------------------------------------
		
		int e;
		String s1, s2, s3;
		
		e = sc.nextInt();  // A quebra de linha fica pendente na entrada padrão
		sc.nextLine();  // Consome a quebra de linha pendente, limpa o buffer de leitura
		
		// Lendo um texto até a quebra de linha
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(e);
		System.out.printf("%s%n%s%n%s%n", s1, s2, s3);
		
		// Encerra o recurso de Scanner
		sc.close();
	}

}
