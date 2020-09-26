package api;

import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		Instant instant1 = Instant.parse("2017-02-03T10:37:30.00Z");
		System.out.println(instant1);
	}

}
