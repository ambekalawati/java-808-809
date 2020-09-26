package calender;

import java.time.Duration;
import java.time.LocalDate;

public class test {

	public static void main(String[] args) {
Duration ofDays = Duration.ofDays(1);
LocalDate of = LocalDate.of(2019, 1, 1);
System.out.println(of.plusDays(ofDays.toDays()));
	}

}
