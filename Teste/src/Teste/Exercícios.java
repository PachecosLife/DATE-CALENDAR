package Teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exercícios {
		
		public static void main(String[] args) throws ParseException {
			
						//SISTEMA DE THREAD ENVIANDO EMAIL + NOTA FISCAL 
			
			Thread threadEmail = new Thread(thread1);
			threadEmail.start();
			
			Thread threadNotaFiscal = new Thread(thread2);
			threadNotaFiscal.start();
			
			System.out.println("==========================");
			System.out.println("===== EMAIL ENVIADO ======");
			System.out.println("==========================");
			System.out.println("=== NOTA FISCAL ENVIADA ==");
			System.out.println("==========================");
			JOptionPane.showMessageDialog(null, "E-mail enviado !");			
			
		}
					//PROCESSO DE ENVIO DO EMAIL
			public static Runnable thread1 = new Runnable() {
			
			public void run() {
				for (int pos = 0; pos < 5; pos++) {
					
					//MODO TRY/CATCH 
					try {
						Thread.sleep(1000); //A CADA 1 SEGUNDO ENVIA EMAIL
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Enviando email");
				}
				
			}
		};
				//PROCESSO DE ENVIO DA NOTA-FISCAL 
		public static Runnable thread2 = new Runnable() {
			
			
			public void run() {
				
				//MODO TRY/CATCH
				for (int pos = 0; pos < 7; pos++) {
					try {
						Thread.sleep(1000); //A CADA 1 SEGUNDO ENVIA EMAIL
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Enviando Nota Fiscal");
				}
				
			}
		};

}
