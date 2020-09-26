package instant;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		Instant.ofEpochSecond(3, 1);
		System.out.println();
		
	}
	 public static Instant now() {
	        return Clock.systemUTC().instant();
	    }

}
