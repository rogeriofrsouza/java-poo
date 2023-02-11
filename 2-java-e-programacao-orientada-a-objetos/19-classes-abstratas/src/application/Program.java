package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Account acc1 = new Account(1001, "Alex Green", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Maria Brown", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob Blue", 1000.0, 500.0);
		
		/*
		 *  Reuso, polimorfismo e upcasting
		 */
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1004, "Alex Green", 500.0, 0.01));
		list.add(new BusinessAccount(1005, "Bryan Thompson", 1000.0, 400.0));
		list.add(new SavingsAccount(1006, "John Miles", 300.0, 0.01));
		list.add(new BusinessAccount(1007, "Anna Red", 500.0, 500.0));
		
		// 1. Totalizar todos os saldos, independente do tipo de conta
		double sum = 0.0;
		
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: $%.2f%n", sum);
		
		// 2. Depositar o valor de 10.0 em todas as contas
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: $%.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}
