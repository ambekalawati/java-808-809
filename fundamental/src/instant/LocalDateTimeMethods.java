package instant;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class LocalDateTimeMethods {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2017, Month.FEBRUARY, 3, 6, 30, 40, 50000);
		System.out.println(date);// of()
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println(date1);// now()
		LocalDateTime date2 = LocalDateTime.parse("2019-12-31T11:30:15");
		System.out.println(date2);// parse()
		LocalDateTime date3 = date2.minusDays(10);
		System.out.println(date3);// minusDays()
		LocalDateTime date4 = date2.minusMonths(11);
		System.out.println(date4);// minusMonths()
		LocalDateTime date5 = date2.plusDays(2);
		System.out.println(date5);// plusDays()
		LocalDateTime date6 = date2.plus(Period.ofYears(11));
		System.out.println(date6);//plus(TemporalAmountAdd)
		System.out.println(date2.getDayOfMonth());
		System.out.println(date2.getDayOfYear());
		System.out.println(date2.getNano());//0
		System.out.println(date2.get(ChronoField.DAY_OF_MONTH));//31
		System.out.println(date2.range(ChronoField.DAY_OF_MONTH));
		System.out.println(date2.range(ChronoField.EPOCH_DAY));//-365243219162 - 365241780471
		System.out.println(date2.toLocalDate());
		ZoneOffset zone = ZoneOffset.of("+12:00");
		System.out.println(date2.atOffset(zone));
		System.out.println(date2.isSupported(ChronoField.DAY_OF_WEEK));
		System.out.println(date2.isAfter(date4));
		System.out.println(date2.isBefore(date4));
		System.out.println(date2.adjustInto(date4));

	}

}
