package DataJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import sun.util.resources.LocaleData;

public class DataJava4 {

		public static void main(String[] args) throws ParseException {
		
			Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataInicial);
			
			for (int parcela = 1; parcela < 12; parcela ++) {
				calendario.add(Calendar.MONTH, + 1);
				
				System.out.println("PARCELA DE NÚMERO " + parcela + ". VENCIMENTO EM " + new SimpleDateFormat("dd/MM/yyyy").format
						(calendario.getTime()));
			}
			

	}

}
