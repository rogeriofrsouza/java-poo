package entities;

// Esta classe herda todos os dados e comportamentos da class Account
public class BusinessAccount extends Account {
	
	// Atributo específico da classe
	private Double loanLimit;
	
	public BusinessAccount() {
		super();  // Executa a lógica implementada no construtor da super classe
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);  // Chama o construtor com argumentos da super classe
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// Método específico da classe
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	// final não permite que este método seja sobreposto. Sobreposições múltiplas podem gerar inconsistências
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);  // Reaproveita a lógica do método da super classe
		balance -= 2.0;
	}
	
}
