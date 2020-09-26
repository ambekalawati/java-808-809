package api;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
		// now(clock,clock)
		Clock c1 = Clock.systemUTC();
		LocalDateTime localdatetime1 = LocalDateTime.now(c1);
		System.out.println(localdatetime1);
		ZoneId zid = ZoneId.of("Europe/paris");
		LocalDateTime localdatetime2 = LocalDateTime.now(zid);
		System.out.println(localdatetime2);
	}

}
