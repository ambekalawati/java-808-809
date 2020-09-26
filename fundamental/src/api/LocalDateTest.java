package api;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2012, 01, 29);
		LocalDate plusYears = of.plusYears(2);
		System.out.println(plusYears);
	}

}
