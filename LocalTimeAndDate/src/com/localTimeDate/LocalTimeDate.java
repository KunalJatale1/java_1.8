package com.localTimeDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDate {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalTime t = LocalTime.now();
		System.out.println(t);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		System.out.println(d.plusDays(-31));

		System.out.println();
		// also able to create a object

		LocalDate d1 = LocalDate.of(2026, Month.MARCH, 18);
		System.out.println(d1);

		// difference between 2 dates but same object we need

		LocalDateTime d2 = LocalDateTime.now();
		LocalDateTime d3 = LocalDateTime.of(2026, 3, 27, 12, 1);

		Duration dur = Duration.between(d2, d3);
		System.out.println(dur.toDays());

		// string to date format
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-mm-dd");

		String date = "2026-03-18";
		LocalDate ld = LocalDate.parse(date);
		System.out.println(ld);

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("currentTimeInIndia" + zonedDateTime);

		ZonedDateTime edtzone = zonedDateTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		System.out.println(edtzone);
	}
}
