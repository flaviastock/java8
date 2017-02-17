package lambdasstreams;

import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Set;

public class JavaTimeDemos {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		
		Instant then = now.plus(1, ChronoUnit.DAYS);
		Duration elapsed = Duration.between(now, then);
		System.out.printf("Duration after adding 1 day %s%n", elapsed);
		System.out.printf("Duration in days: %d days%n", elapsed.toDays());
		System.out.printf("Duration in hours: %d hours%n", elapsed.toHours());
		
		then = now.plus(1, ChronoUnit.DAYS)
				.plus(1, ChronoUnit.HALF_DAYS)
				.plus(1, ChronoUnit.HOURS)
				.plus(10, ChronoUnit.MINUTES)
				.plusSeconds(10)
				.plusMillis(100)
				.plusNanos(100);
		System.out.printf("Adding units to now: %s%n", then);
		
		LocalDate date1 = LocalDate.now();
		System.out.printf("LocalDate.now() %s%n", date1);
		
		LocalDate groundHogDay = LocalDate.of(2016, Month.FEBRUARY, 2);
		System.out.printf("GroundHog Day, 2016 %s%n", groundHogDay);
		
		LocalDate firstDayOfSpring = LocalDate.of(2016, Month.MARCH, 20);
		System.out.printf("First Day of Spring, 2016 %s%n", firstDayOfSpring);
		
		System.out.printf("First Day of Spring this year falls on a  %s%n", firstDayOfSpring.getDayOfWeek());
		
		long gap = groundHogDay.until(firstDayOfSpring, ChronoUnit.DAYS);
		System.out.println("There are " + gap + "days between ...");
		System.out.println("That's " + gap / 7 + "weeks and " + gap % 7 + "days");
		
		Set<String> availableTimeZones = ZoneId.getAvailableZoneIds();
		System.out.printf("Total numbers of time zones: %d%n", availableTimeZones.size());
		
		availableTimeZones.stream().filter(name -> name.contains("America")).forEach(System.out::println);
		
		ZonedDateTime missing = ZonedDateTime.of(LocalDate.of(2016, Month.MARCH, 13), LocalTime.of(2, 30), ZoneId.of("America/New_York"));
		System.out.println(missing);
		
		ZonedDateTime spring = ZonedDateTime.of(2016, 3, 20, 20, 0, 0, 0, ZoneId.systemDefault());
		
		System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(spring));
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.FRANCE);
		System.out.println(formatter.format(spring));
		
	}

}
