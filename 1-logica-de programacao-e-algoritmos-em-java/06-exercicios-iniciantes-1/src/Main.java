import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 
		 * 1. Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		 * mensagem explicativa, conforme exemplos. 
		 */
		System.out.println("Exercício 1");
		
		int a, b;
		
		System.out.print("Valor 1: ");
		a = sc.nextInt();
		System.out.print("Valor 2: ");
		b = sc.nextInt();
		
		System.out.printf("A soma entre %d e %d é igual a %d%n%n", a, b, a + b);
		// -----------------------------
		
		/* 
		 * 2. Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos. Fórmula da área: area = π * raio². Considere o valor de π = 3.14159
		 */
		System.out.println("Exercício 2");
		
		double raio, area;
		
		System.out.print("Raio: ");
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("Área do círculo = %.4f%n%n", area);
		// ------------------------------
		
		/* 
		 * 3. Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		System.out.println("Exercício 3");
		
		int i, j, k, l, diferenca;
		
		System.out.print("Informe 4 valores: ");
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		l = sc.nextInt();
		
		diferenca = (i * j - k * l);
		System.out.printf("Diferença = %d%n%n", diferenca);
		// -------------------------------
		
		/*
		 * 4. Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		 * decimais.
		 */		
		System.out.println("Exercício 4");
		
		int numero, horas;
		double salarioHora, salarioFinal;

		System.out.print("Número funcionário: ");
		numero = sc.nextInt();
		System.out.print("Horas de trabalho: ");
		horas = sc.nextInt();
		System.out.print("Salário hora: R$");
		salarioHora = sc.nextDouble();
		
		salarioFinal = horas * salarioHora;
		System.out.printf("Funcionário: %d | Salário: R$%.2f%n%n", numero, salarioFinal);
		// -------------------------------
		
		/*
		 * 5. Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		System.out.println("Exercício 5");
		
		int cod1, numeroPecas1, cod2, numeroPecas2;
		double valor1, valor2, valorFinal;
		
		System.out.println("Peça 1");
		System.out.print("Código: ");
		cod1 = sc.nextInt();
		System.out.print("Número de peças: ");
		numeroPecas1 = sc.nextInt();
		System.out.print("Valor peça: R$");
		valor1 = sc.nextDouble();
		
		System.out.println("Peça 2");
		System.out.print("Código: ");
		cod2 = sc.nextInt();
		System.out.print("Número de peças: ");
		numeroPecas2 = sc.nextInt();
		System.out.print("Valor peça: R$");
		valor2 = sc.nextDouble();
		
		valorFinal = (numeroPecas1 * valor1) + (numeroPecas2 * valor2);
		System.out.printf("Valor final = R$%.2f%n%n", valorFinal);
		// -------------------------------
		
		/*
		 * 6. Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
		 * Em seguida, calcule e mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 */
		System.out.println("Exercício 6");
		
		double x, y, z, areaTri, areaCirc, areaTrap, areaQuadr, areaRet;
		
		System.out.print("Informe 3 valores: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		areaTri = x * z / 2;
		areaCirc = Math.PI * Math.pow(z, 2);
		areaTrap = (x + y) / 2 * z;
		areaQuadr = y * y;
		areaRet = x * y;
		
		System.out.printf("Triângulo: %f%nCírculo: %f%nTrapézio: %f%nQuadrado: %f%nRetângulo: %f", areaTri, areaCirc, areaTrap, areaQuadr, areaRet);
		
		sc.close();
	}

}
