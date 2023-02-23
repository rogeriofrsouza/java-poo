package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double amount = contract.getTotalValue() / months;
			
			amount += onlinePaymentService.interest(amount, i);
			amount += onlinePaymentService.paymentFee(amount);
			
			contract.getInstallments().add(new Installment(dueDate, amount));
		}
	}
	
}
