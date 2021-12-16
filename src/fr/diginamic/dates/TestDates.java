package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		
		Date date1 = new Date(2021-1900, 11, 16);
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur1.format(date1));
		
		Date date2 = new Date(2016-1900,4,19,23,59,30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur2.format(date2));
		
		Date date3 = new Date(System.currentTimeMillis());
		System.out.println(formateur2.format(date3));
	}

}
