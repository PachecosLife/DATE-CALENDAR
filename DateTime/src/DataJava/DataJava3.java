package DataJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataJava3 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("04/02/2022"));
		System.out.println("DATA ATUAL " + new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime())); //DATA ATUAL SEM ALTERAÇÕES
		
		calendario.add(Calendar.DAY_OF_MONTH, 5); //DATA ATUAL MAIS 5 DIAS.
		System.out.println("ACRESCENTANDO 5 DIAS A DATA SE TORNA = " + new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));
		
		calendario.add(Calendar.MONTH, 2); //DATA ATUAL MAIS 2 MESES.
		System.out.println("ACRESCENTANDO 2 MESES A DATA SE TORNA = " + new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));
		
		System.out.println("==============================================");

	}

}
