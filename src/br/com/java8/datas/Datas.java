package br.com.java8.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.MARCH, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo.getDays());
		
		LocalDate proximaOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximaOlimpiadas);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = formatter.format(proximaOlimpiadas);
		System.out.println(valorFormatado);
		
		// Hora, minuto e segundo
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		YearMonth mes = YearMonth.of(2015, Month.JANUARY);
		System.out.println(mes.getYear());
		
		
		
				
	}

		

}
