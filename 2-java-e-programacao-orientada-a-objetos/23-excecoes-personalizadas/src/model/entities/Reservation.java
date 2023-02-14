package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private Integer roomNumer;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	// static não permite instanciar um novo fmt para cada objeto Reservation
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation() {
	}

	public Reservation(Integer roomNumer, LocalDate checkIn, LocalDate checkOut) {
		this.roomNumer = roomNumer;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumer() {
		return roomNumer;
	}

	public void setRoomNumer(Integer roomNumer) {
		this.roomNumer = roomNumer;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}
	
	// Remover setCheckIn() e setCheckOut()

	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		return ChronoUnit.DAYS.between(checkIn, checkOut);
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room: " 
				+ roomNumer 
				+ ", check-in: " 
				+ checkIn.format(fmt) 
				+ ", check-out: " 
				+ checkOut.format(fmt) 
				+ ", " 
				+ duration() 
				+ " nights";
	}

}
