package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
		 * informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
		 * mostrando os dados da conta após cada operação.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: $");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: $");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated account data");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: $");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Updated account data");
		System.out.println(account);
		
		sc.close();
		
	}

}
