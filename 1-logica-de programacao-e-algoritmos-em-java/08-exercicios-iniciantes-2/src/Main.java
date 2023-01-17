import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 1. Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		 */
		System.out.println("Exercício 1");
		
		int a;
		
		System.out.print("Informe um valor: ");
		a = sc.nextInt();
		
		if (a < 0)
			System.out.printf("NEGATIVO%n%n");
		else
			System.out.printf("POSITIVO%n%n");
		// --------------------------------
		
		/*
		 * 2. Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		 */
		System.out.println("Exercício 2");
		
		int b;
		
		System.out.print("Informe um valor: ");
		b = sc.nextInt();
		
		if (b % 2 == 0)
			System.out.printf("PAR%n%n");
		else
			System.out.printf("ÍMPAR%n%n");
		// --------------------------------
		
		/*
		 * 3. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		 * ordem crescente ou decrescente.
		 */
		System.out.println("Exercício 3");
		
		int c, d;
		
		System.out.print("Informe dois valores: ");
		c = sc.nextInt();
		d = sc.nextInt();
		
		if (c % d == 0 || d % c == 0)
			System.out.printf("São múltiplos%n%n");
		else
			System.out.printf("NÃO são múltiplos%n%n");
		// --------------------------------
		
		/*
		 * 4. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		System.out.println("Exercício 4");
		
		int horaInicial, horaFinal, duracao;
		
		System.out.print("Informe hora inicial e final: ");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		duracao = horaFinal - horaInicial;
		
		if (horaInicial >= horaFinal)
			duracao += 24;
		
		System.out.printf("O jogo durou %d hora(s)%n%n", duracao);
		// --------------------------------
		
		/*
		 * 5. Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 */
		System.out.println("Exercício 5");
		
		int cod, qtde;
		double preco;
		
		System.out.print("Informe o código e quantidade: ");
		cod = sc.nextInt();
		qtde = sc.nextInt();
		
		switch (cod) {
			case 1:
				preco = 4.0; break;
			case 2:
				preco = 4.5; break;
			case 3:
				preco = 5.0; break;
			case 4:
				preco = 2.0; break;
			case 5:
				preco = 1.5; break;
			default:
				preco = 0.0;
		}
		
		System.out.printf("Total: R$%.2f%n%n", qtde * preco);
		// --------------------------------
		
		/*
		 * 6. Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		 * nenhum destes intervalos, deverá ser impressa a mensagem "Fora de intervalo".
		 */
		System.out.println("Exercício 6");
		
		double valor;
		
		System.out.print("Informe um valor: ");
		valor = sc.nextDouble();
		
		if (valor < 0.0 || valor > 100.0) {
			System.out.printf("Fora de intervalo%n%n");			
		}
		else if (valor <= 25.0) {
			System.out.printf("Intervalo [0, 25]%n%n");				
		}
		else if (valor <= 50.0) {
			System.out.printf("Intervalo [25, 50]%n%n");				
		}
		else if (valor <= 75.0) {
			System.out.printf("Intervalo [50, 75]%n%n");				
		}
		else {
			System.out.printf("Intervalo [75, 100]%n%n");					
		}
			
		// --------------------------------
		
		/*
		 * 7. Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
		 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		 * Se o ponto estiver na origem, escreva a mensagem "Origem". Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", 
		 * conforme for a situação.
		 */
		System.out.println("Exercício 7");
		
		double x, y;
		
		System.out.print("Informe as coordenadas: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.printf("Origem%n%n");			
		}
		else if (x == 0.0) {
			System.out.printf("Eixo Y%n%n");			
		}
		else if (y == 0.0) {
			System.out.printf("Eixo X%n%n");			
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.printf("Q1%n%n");				
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.printf("Q2%n%n");				
		} 
		else if (x < 0.0 && y < 0.0) {
			System.out.printf("Q3%n%n");				
		}
		else {
			System.out.printf("Q4%n%n");				
		}
		// --------------------------------
		
		/*
		 * 8. Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		 * que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 * 
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre 
		 * o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 * 
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
		 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
		 */
		System.out.println("Exercício 8");
		
		double salario, imposto;
		
		System.out.print("Informe o salário: R$");
		salario = sc.nextDouble();
		
		if (salario < 0.0)
			System.exit(1);
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000.0 * 0.08;			
		}
		
		if (imposto == 0.0)
			System.out.printf("Isento");
		else
			System.out.printf("R$%.2f", imposto);
		
		sc.close();
	}

}
