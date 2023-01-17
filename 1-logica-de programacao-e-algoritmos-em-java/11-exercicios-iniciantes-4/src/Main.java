import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 1. Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
		 * inclusive o X, se for o caso.
		 */
		System.out.println("Exercício 1");
		
		System.out.print("Informe o valor: ");
		int x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}
		// ---------------------------
		
		/*
		 * 2. Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */
		System.out.println("\nExercício 2");
		
		int n, valor, in = 0, out = 0;
		
		System.out.print("Casos de teste: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Informe o valor: ");
			valor = sc.nextInt();
			
			if (valor >= 10 && valor <= 20)
				in++;
			else
				out++;
		}
		
		System.out.printf("%d in%n%d out%n%n", in, out);
		// ---------------------------
		
		/*
		 * 3. Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		 * peso 5.
		 */
		System.out.println("Exercício 3");
		
		double a, b, c, media;
		
		System.out.print("Casos de teste: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Informe 3 valores reais: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("Média: %.1f%n%n", media);
		}
		// ---------------------------
		
		/*
		 * 4. Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		System.out.println("Exercício 4");
		
		double d, e;
		
		System.out.print("Casos de teste: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Informe um par de números: ");
			d = sc.nextInt();
			e = sc.nextInt();
			
			if (e == 0) {
				System.out.println("Divisão impossível");				
			}
			else {
				System.out.println("Divisão: " + d / e);
			}
		}
		// ---------------------------
		
		/*
		 * 5. Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * Lembrando que, por definição, fatorial de 0 é 1.
		 */
		System.out.println("\nExercício 5");
		
		int fat = 1;
		
		System.out.print("Informe o valor: ");
		n = sc.nextInt();
		
		for (int i = n; i > 1; i--)
			fat *= i;
		
		System.out.printf("%d! = %d%n%n", n, fat);
		// ---------------------------
		
		/*
		 * 6. Ler um número inteiro N e calcular todos os seus divisores.
		 */
		System.out.println("Exercício 6");
		
		System.out.print("Informe o valor: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.println(i);
		}
		// ---------------------------
		
		/*
		 * 7. Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
		 */
		System.out.println("\nExercício 7");
		
		int quadrado, cubo;
		
		System.out.print("Casos de teste: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			quadrado = (int) Math.pow(i, 2.0);
			cubo = (int) Math.pow(i, 3.0);
			
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		sc.close();
	}

}
