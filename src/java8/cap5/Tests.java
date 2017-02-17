package java8.cap5;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

import java8.Exercise;

public class Tests implements Exercise {

	@Test
	@Override
	public void perform() {
//		Instant start = Instant.now();
//		getWordsAsList();
//		Instant end = Instant.now();
//		Duration timeElapsed = Duration.between(start, end);
//		long millis = timeElapsed.toMillis();
//		System.out.println(millis);
//		
//		Instant start2 = Instant.now();
//		getWordsAsArray();
//		Instant end2 = Instant.now();
//		Duration timeElapsed2 = Duration.between(start2, end2);
//		millis = timeElapsed2.toMillis();
//		System.out.println(millis);
//		boolean overTenTimesFaster = timeElapsed.multipliedBy(10).minus(timeElapsed2).isNegative();
//		System.out.println(overTenTimesFaster);
		// Or timeElapsed.toNanos() * 10 < timeElapsed2.toNanos()
		
//		LocalDate date = LocalDate.now();
//		System.out.println(date.withDayOfMonth(20));
		
//		LocalDate programmersDay = LocalDate.of(2016, 1, 1).plusDays(255);
//		System.out.println(LocalDate.of(1900, 1, 1).getDayOfWeek());
		
//		LocalDate firstTuesday = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
		LocalDate today = LocalDate.now();
//		TemporalAdjuster NEXT_WORKDAY = w -> {
//			LocalDate result = (LocalDate) w;
//			do {
//				result = result.plusDays(1);
//			} while (result.getDayOfWeek().getValue() >= 6);
//			return result;
//		};
//
//		LocalDate backToWork = today.with(NEXT_WORKDAY);
//		System.out.println(backToWork);
		
//		TemporalAdjuster NEXT_WORKDAY = TemporalAdjusters.ofDateAdjuster( w -> {
//			LocalDate result = w;
//			do {
//				result = result.plusDays(1);
//			} while (result.getDayOfWeek().getValue() >= 6);
//			return result;
//		});
//		
//		LocalDate  backToWork = today.with(NEXT_WORKDAY);
//		
//		System.out.println(today);
//		System.out.println(backToWork);
		
//		
//		LocalTime rightNow = LocalTime.now();
//		LocalTime bedtime = LocalTime.of(22, 30); // or LocalTime.of(22, 30, 0)
		
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
//		
//		Set<String> zoneId = ZoneId.getAvailableZoneIds();
//		zoneId.stream().filter(s -> s.startsWith("B")).forEach(System.out::println);
//		
//		System.out.println(now.atZone(ZoneId.of("Brazil/East")));
		
//		System.out.println(ZonedDateTime.now());
//		
//		ZonedDateTime skipped = ZonedDateTime.of(LocalDate.of(2013, 3, 31), LocalTime.of(2, 30),
//				ZoneId.of("Europe/Berlin"));
//		
//		System.out.println(skipped);
		
		
//		ZonedDateTime ambiguous = ZonedDateTime.of(LocalDate.of(2013, 10, 27), // End of daylight savings time
//				LocalTime.of(2, 30), ZoneId.of("Europe/Berlin"));
//		// 2013-10-27T02:30+02:00[Europe/Berlin]
//		ZonedDateTime anHourLater = ambiguous.plusHours(1);
//		// 2013-10-27T02:30+01:00[Europe/Berlin]
//		
//		System.out.println(ambiguous);
//		System.out.println(anHourLater);"
		
		
//		LocalDateTime novo = LocalDateTime.now();
//		Date banco = Date.valueOf(LocalDate.now().toString());
//		System.out.println(banco);
//		System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(ZonedDateTime.now()));
//		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
//		System.out.println(formatter.withLocale(Locale.GERMANY).format(ZonedDateTime.now()));
//		System.out.println(formatter.toFormat());
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		System.out.println(formatter.format(LocalDate.now()));
//		ZonedDateTime apollo11launch = DateTimeFormatter.		
//		System.out.println(apollo11launch);
		
//		Ex 2:
		
		LocalDate data1 = LocalDate.of(2000, 2, 29);
		System.out.println(data1.plusYears(1));
		System.out.println(data1.plusYears(4));
		System.out.println(data1.plusYears(1).plusYears(1).plusYears(1).plusYears(1));
		
		
		LocalDate start = LocalDate.of(1985, Month.JULY, 11);
		System.out.println(start.until(LocalDate.now(), ChronoUnit.DAYS));
		
		
		
	}
}
