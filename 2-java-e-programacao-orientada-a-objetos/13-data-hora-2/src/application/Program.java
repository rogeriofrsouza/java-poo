package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		/* Operações importantes com data-hora */
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		/* 
		 * Coleção com nomes dos fuso horários
		 * for (String s : ZoneId.getAvailableZoneIds()) {
		 *     System.out.println(s);
		 * }
		 */
		
		// Converter data-hora global para local
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println();
		
		// Obter dados de uma data-hora local
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 mês = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minutos = " + d02.getMinute());
		System.out.println();
		
		// Cálculos com data-hora (Data-hora é um objeto imutável)
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime minusHoursLocalDateTime = d02.minusHours(48);
		LocalDateTime plusMinutesLocalDateTime = d02.plusMinutes(150);
		
		System.out.println("minusHoursLocalDateTime = " + minusHoursLocalDateTime);
		System.out.println("plusMinutesLocalDateTime = " + plusMinutesLocalDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println();
		
		// Duração
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());  // Não é possível calcular tempo de duração entre 2 LocalDate, converter para LocalDateTime
		Duration t2 = Duration.between(minusHoursLocalDateTime, d02);
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(nextWeekInstant, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 horas = " + t2.toHours());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
	}

}
