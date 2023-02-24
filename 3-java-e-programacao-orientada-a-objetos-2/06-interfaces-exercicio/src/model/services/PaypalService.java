package model.services;

public class PaypalService implements OnlinePaymentService {

	// Juros simples de 1% a cada parcela
	@Override
	public double interest(double amount, int months) {
		return amount * 0.01 * months;
	}
	
	// Taxa de pagamento de 2%
	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}

}
