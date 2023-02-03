package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		/* 1. Instanciação */
		
		// (agora) -> Data-hora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();  // Horário local do sistema
		Instant d03 = Instant.now();  // Horário global com fuso horário de Londres (GMT)
		
		// Texto ISO 8601 -> Data-hora
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");  // Especificando o timezone GMT-3
		
		// Texto formato customizado -> Data-hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // Objeto de formatação de Data-hora
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);  // Sobrecarga que aceita o segundo argumento
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		// Dia, mês, ano, [horário] -> Data-hora local
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("d01 = " + d01);  // Imprime o texto no formato ISO 8601
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);	
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println();
		// ------------------------------------------------------
		
		/* 2. Formatação */
		
		LocalDate d12 = LocalDate.parse("2023-02-03");
		LocalDateTime d13 = LocalDateTime.parse("2023-02-03T11:45:52");
		Instant d14 = Instant.parse("2023-02-03T11:45:52Z");
		
		// Data-hora -> Texto formato customizado
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());  // Utiliza o fuso horário do sistema local
		
		System.out.println("d12 = " + d12.format(fmt3));
		System.out.println("d12 = " + fmt3.format(d12));
		System.out.println("d12 = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d13 = " + d13.format(fmt3));
		System.out.println("d13 = " + d13.format(fmt4));
		System.out.println("d14 = " + fmt5.format(d14));  // Instant não possui o método format()
		System.out.println();
		
		// Data-hora -> Texto ISO 8601
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;  // Data-hora local
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;  // Data-hora global
		
		System.out.println("d13 = " + d13.format(fmt6));
		System.out.println("d14 = " + fmt7.format(d14));

	}

}
