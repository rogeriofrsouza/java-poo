package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		/*
		 * 1. Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		 */
		System.out.println("Exercício 1");
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números negativos");
		
		for (i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		// --------------------------------
		
		/*
		 * 2. Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		 * - Imprimir todos os elementos do vetor
		 * - Mostrar na tela a soma e a média dos elementos do vetor
		 */
		System.out.println("\nExercício 2");
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		double soma = 0.0, media;
		
		for (i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores = ");
		
		for (i = 0; i < vet.length; i++) {
			System.out.printf("%.1f  ", vet[i]);
			soma += vet[i];
		}
		
		media = soma / n;
		
		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Média = %.2f%n%n", media);
		// --------------------------------
		
		/*
		 * 3. Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		 * bem como os nomes dessas pessoas caso houver.
		 */
		System.out.println("Exercício 3");
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		double alturaMedia = 0.0, porcentualMenor16;
		String[] menor16 = new String[n];
		int cont = 0;
		
		for (i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa%n", i + 1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			alturaMedia += altura;
			
			if (idade < 16) {
				menor16[cont] = nome;
				cont++;
			}
			
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		alturaMedia /= n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		porcentualMenor16 = (double) cont / n * 100.0;
		System.out.println("Pessoas com menos de 16 anos: " + porcentualMenor16 + "%");
		
		for (i = 0; i < menor16.length; i++) {
			if (menor16[i] != null) 
				System.out.println(menor16[i]);
		}
		// --------------------------------
		
		/*
		 * 4. Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		 * tela todos os números pares, e também a quantidade de números pares.
		 */
		System.out.println("\nExercício 4");
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		vect = new int[n];
		int qtdePares = 0;
		
		for (i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números pares:");
		
		for (i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d  ", vect[i]);
				qtdePares++;				
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares: " + qtdePares);
		// --------------------------------
		
		/*
		 * 5. Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		 * considerando a primeira posição como 0 (zero).
		 */
		System.out.println("\nExercício 5");
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		vet = new double[n];
		double maior = 0.0;
		int posMaior = -1;
		
		for (i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		for (i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posMaior = i;
			}
		}
		
		System.out.println();
		System.out.println("Maior valor = " + maior);
		System.out.println("Posição do maior valor = " + posMaior);
		// --------------------------------
		
		/*
		 * 6. Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		 * o vetor C gerado.
		 */
		System.out.println("\nExercício 6");
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		
		for (i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for (i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println("Vetor resultante:");
		
		for (i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		// --------------------------------
		
		/*
		 * 7. Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
		 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
		 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
		 */
		System.out.println("\nExercício 7");
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		vet = new double[n];
		media = 0.0;
		
		for (i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			
			media += vet[i];
		}
		
		media /= n;
		
		System.out.println();
		System.out.printf("Média do vetor = %.3f%n", media);
		
		System.out.println("Elementos abaixo da média:");
		
		for (i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}
		// --------------------------------
		
		/*
		 * 8. Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
		 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
		 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
		 */
		System.out.println("\nExercício 8");
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		vect = new int[n];
		double mediaPares = 0.0;
		qtdePares = 0;
		
		for (i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0) {
				mediaPares += vect[i];
				qtdePares++;
			}
		}
		
		if (qtdePares > 0) {
			mediaPares /= qtdePares;
			System.out.printf("Média dos pares = %.1f%n", mediaPares);
		}
		else {
			System.out.println("Nenhum número par");
		}
		// --------------------------------
		
		/*
		 * 9. Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
		 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
		 * da pessoa mais velha.
		 */
		System.out.println("\nExercício 9");
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		pessoas = new Pessoa[n];
		
		int maiorIdade = 0;
		String velha = null;
		
		for (i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa%n", i + 1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
				velha = nome;
			}
			
			pessoas[i] = new Pessoa(nome, idade);
		}
		
		System.out.println();
		System.out.println("Pessoa mais velha: " + velha);
		// --------------------------------
		
		/*
		 * 10. Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
		 * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
		 * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
		 * igual a 6.0 (seis).
		 */
		System.out.println("\nExercício 10");
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] medias = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
			
			sc.nextLine();
			nomes[i] = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			medias[i] = (double) (nota1 + nota2) / 2.0;
		}
		
		System.out.println();
		System.out.println("Alunos aprovados:");
		
		for (i = 0; i < nomes.length; i++) {
			if (medias[i] >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		// --------------------------------
		
		/*
		 * 11. Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
		 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
		 * de homens.
		 */
		System.out.println("\nExercício 11");
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			
			System.out.printf("Gênero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
		}
		
		double menorAltura = alturas[0], maiorAltura = 0.0, mediaMulheres = 0.0;
		int qtdeHomens = 0, qtdeMulheres = 0;
		
		for (i = 0; i < n; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			
			if (generos[i] == 'F') {
				mediaMulheres += alturas[i];
				qtdeMulheres++;
			}
			else {
				qtdeHomens++;
			}				
		}
		
		mediaMulheres /= qtdeMulheres;
		
		System.out.println();
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);

		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Número de homens = " + qtdeHomens);
		
		sc.close();
	}

}
