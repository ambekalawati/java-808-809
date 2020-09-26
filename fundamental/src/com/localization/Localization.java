package com.localization;

import java.util.Arrays;
import java.util.Locale;

public class Localization {
	public static void printContentByLocale(String country) {
		switch (country) {
		case "IN": {
			System.out.println("Namaste");
			break;
		}
		case "US": {
			System.out.println("Hello");
			break;
		}
		case "UK": {
			System.out.println("Hello 2");
			break;
		}
		default: {
			System.out.println("hi");
		}
		}
	}

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.ENGLISH);
		String[] list = locale.getISOCountries();
//		Arrays.stream(list).forEach(System.out::println);
// Q.How many ways you can create an Object of the Locale?
//		1.using Constructor
		Locale locale1 = new Locale("en");
		Locale locale6 = new Locale("hi", "IN", "");
		System.out.println(locale1.getDisplayLanguage());
//		System.out.println(locale1.getDisplayScript(locale1));
//		Way 2
		Locale locale2 = Locale.CANADA;
//		way 3
		Locale locale3 = Locale.getDefault();

//		way 4
		Locale locale4 = new Locale.Builder().setLanguageTag("it").build();
		System.out.println(locale4.getDisplayCountry());
//		way 5
		Locale locale5 = Locale.forLanguageTag("it");

		Locale[] availableLocales = Locale.getAvailableLocales();
//	    Arrays.stream(availableLocales).forEach(l->System.out.println(l.getLanguage()+" "+
//		l.getDisplayLanguage()+" "+l.getCountry()+" "+l.getDisplayCountry()));
//		printContentByLocale("IN");

	}

}
