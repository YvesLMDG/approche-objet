package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);
		
		Date date1 = cal1.getTime();
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur1.format(date1));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2021, 11, 16);
		Date date2 = cal2.getTime();
		System.out.println(formateur1.format(date2));

		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur2.format(date2));
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		System.out.println(formateur3.format(date2));
		
		Locale l = new Locale("ru");
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", l);
		System.out.println(formateur4.format(date2));
		
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
		System.out.println(formateur5.format(date2));
		
		SimpleDateFormat formateur6 = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
		System.out.println(formateur6.format(date2));
	}

}
