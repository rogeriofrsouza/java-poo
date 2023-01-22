package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 1. Fazer um programa para ler os valores da largura e altura de um retângulo. 
		 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
		 */
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rectangle.area());
		System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());
		System.out.println();
		// --------------------------------		
		
		/*
		 * 2. Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) 
		 * e mostrar novamente os dados do funcionário.
		 */
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		sc.nextLine();
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: $");
		employee.grossSalary = sc.nextDouble();
	
		System.out.print("Tax: $");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		System.out.println();
		// --------------------------------		
		
		/*
		 * 3. Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		 * ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
		 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
		 */
		Student student = new Student();
		
		System.out.print("Student: ");
		sc.nextLine();
		student.name = sc.nextLine();
		
		System.out.println("Enter student notes:");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Final grade = " + student.finalGrade());
		
		if (student.finalGrade() >= 60.0) {
			System.out.println("PASS");			
		}
		else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points", student.missingPoints());			
		}
		
		sc.close();
		
	}

}
