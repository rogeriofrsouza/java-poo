package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. 
		 * Não deve haver repetição de id. Em seguida, efetuar o aumento de X porcento no salário de um determinado funcionário.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e 
		 * abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários.
		 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. 
		 * Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			// Validando id informado
			while (hasId(list, id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: $");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
				
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	}

}
