package services;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	/*
	 *  Este método não pode ser colocado na interface, ele depende do valor da variável armazenado no serviço
	 *  A interface não pode armazenar estado, nem ter construtor
	 */
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
