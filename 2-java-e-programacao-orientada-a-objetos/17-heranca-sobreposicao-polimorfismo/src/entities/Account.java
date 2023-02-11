package entities;

public class Account {

	private Integer number;
	private String holder;  // Atributo do tipo final -> maior performance
	protected Double balance;  // Atributo pode ser acessado pela sub classe (classe derivada)
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	// Não é possível mudar o saldo da conta livremente, remover o setBalance()
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
