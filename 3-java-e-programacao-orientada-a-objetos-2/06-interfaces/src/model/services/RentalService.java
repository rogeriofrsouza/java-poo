package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

/*
 * Inversão de controle: retira da classe a responsabilidade de instanciar suas dependências, 
 * evitando a geração de um forte acoplamento e 2 pontos de alteração
 */
public class RentalService {

	// Service com atributos
	private Double pricePerHour;
	private Double pricePerDay;
	
	private	TaxService taxService;  // Dependência com uma interface genérica, desacoplamento do sistema

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		
		if (hours <= 12) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
