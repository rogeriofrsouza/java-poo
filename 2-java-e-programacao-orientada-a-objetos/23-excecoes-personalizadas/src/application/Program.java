package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	// Tratar a exceção de um método ou propagar ela com o throws Exception
	public static void main(String[] args) {
		
		/* 
		 * 1. Primeira solução - muito ruim
		 * 
		 * Lógica de validação no programa principal: problema grave de delegação
		 */
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(), fmt);
		
		if (checkIn.isAfter(checkOut) || checkIn.isEqual(checkOut)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt);
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), fmt);
			
			if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now()) ) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
			else if (checkIn.isAfter(checkOut) || checkIn.isEqual(checkOut)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");			
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
		
		sc.close();

	}

}
