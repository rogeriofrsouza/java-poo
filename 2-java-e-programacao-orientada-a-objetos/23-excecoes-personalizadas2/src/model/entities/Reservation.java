package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private Integer roomNumer;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
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
	
	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		return ChronoUnit.DAYS.between(checkIn, checkOut);
	}
	
	public String updateDates(LocalDate checkIn, LocalDate checkOut) {
		if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now()) ) {
			return "Reservation dates for update must be future dates";
		}
		
		if (checkIn.isAfter(checkOut) || checkIn.isEqual(checkOut)) {
			return "Check-out date must be after check-in date";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null;  // Indica que não houve erros
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
