package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		/*
		 *  Upcasting: atribuir um objeto da sub classe para a super classe
		 */
		Account acc1 = bacc;  // Herança -> relação "é-um"
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		/*
		 * Downcasting: converter um objeto da super classe para a subclasse
		 */
		BusinessAccount acc4 = (BusinessAccount) acc2;  // Casting manual
		acc4.loan(100.0);
		
		/* 
		 * Nem sempre é possível realizar downcasting e o compilador não sabe disso, o desenvolvedor deve evitar estes erros
		 * 
		 * BusinessAccount acc5 = (BusinessAccount) acc3;  // Operação não permitida
		 */
		
		// Testar se o objeto acc3 é instância de BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			
			acc5.updateBalance();
			System.out.println("Update!");
		}
		// ------------------------------
		
		/*
		 * Polimorfismo: muitas formas
		 * Uma mesma operação em variáveis do mesmo tipo possuem comportamentos diferentes
		 */
		Account acc6 = new Account(1005, "John", 1000.0);
		Account acc7 = new SavingsAccount(1006, "Elizabeth", 1000.0, 0.01);
		Account acc8 = new BusinessAccount(1007, "Roger", 1000.0, 500.0);
		
		acc6.withdraw(200.0);
		acc7.withdraw(200.0);
		acc8.withdraw(200.0);

		System.out.println(acc6.getBalance());
		System.out.println(acc7.getBalance());
		System.out.println(acc8.getBalance());
		// ------------------------------
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
