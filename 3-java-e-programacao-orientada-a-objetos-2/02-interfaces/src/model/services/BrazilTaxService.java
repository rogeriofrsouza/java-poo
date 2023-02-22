package model.services;

// Classe específica (concreta) que implementa uma interface (tipo genérico)
public class BrazilTaxService implements TaxService {

	public double tax(double amount) {
		if (amount <= 100) {
			return amount * 0.2;
		}
		
		return amount * 0.15;
	}
}
