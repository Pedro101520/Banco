package helper;

import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

//helper é uma classe que armazena as funções

public class Utils {
	 static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 static NumberFormat nf = new DecimalFormat("R$ #,##0.00",
			 new DecimalFormatSymbols(new Locale("pt", "BR")));
	 
	 public static String dateParaString(Date data) {
		 return Utils.sdf.format(data);
	 }
	 
	 public static Date stringParaData(String data) {
		 try {
			 return Utils.sdf.parse(data);
		 }catch(ParseException e) {
			 return null;
		 }
	 }
	 
	 public static String doubleParaString(Double valor) {
		 return Utils.nf.format(valor);
	 }
	 
	 public static Double stringParaDouble(String valor) {
		 try {
			 return (Double)Utils.nf.parse(valor);
		 }catch(ParseException e) {
			 return null;
		 }
	 }
	 
	 //Aqui serve para pausar o programa, para exibir o programa por um tempo, para o usuario conseguir
	 //ler a mensagem
	 public static void pausar(int segundos) {
		 try {
			 TimeUnit.SECONDS.sleep(segundos);
		 }catch(InterruptedException e) {
			 System.out.println("Erro ao pausar por " + segundos + " segundos.");
		 }
	 }
}
