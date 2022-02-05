package DataJava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataJava6 {

	public static void main(String[] args) {
		
		LocalDate datAtual = LocalDate.now();
		System.out.println("Data: " + datAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("--");
		System.out.println("Dia da semana: " + datAtual.getDayOfWeek());
		System.out.println("--");
		
		LocalTime horAtual = LocalTime.now();
		System.out.println("Horário: " + horAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		

	}

}
