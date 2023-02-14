package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		/* 
		 * 3. Terceira solução - boa
		 * 
		 * Tratamento de exceções: considera uma execução normal no programa principal
		 * Exceções serão tratadas e não propagadas
		 */
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), fmt);
			
			// Se ocorrer uma exceção, o bloco try será interrompido
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt);
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), fmt);
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch (DateTimeParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		// Tipo de Exception genérico. Upcasting de qualquer exceção inesperada
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();

	}

}
