package entities;

// final não permite que SavingsAccount seja herdada por outra classe
public final class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// A anotação informa ao compilador que este método é uma sobreposição
	@Override
	public void withdraw(double amount ) {
		balance -= amount;
	}
	
}
