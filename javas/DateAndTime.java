package javas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) throws InterruptedException {
		
//		y   --> Year
//		M   --> Month
//		d   --> Day in Month
//		E   --> Day of week
//		H   --> Hour in day (0-23)
//		h   --> Hour in AM/PM (1-12)
//		m   --> Minute in hour
//		s   --> Second in minute
//		S   --> Fraction of second
//		a   --> AM/PM marker (e.g., AM, PM)
//		z   --> Time zone
//		X   --> ISO 8601 time zone
		
		// We are going to explore following.
//		
//		Date-> Represents a date without a time zone
//		LocalTime --> Represents a time without a date or time zone
//		Instant   --> Represents an instantaneous point on timeline
//		Duration  --> Represents a duration of time between two points in time
//		Period    --> Represents a period of time between two dates
//		DateTimeFormatter --> Formats and parses Dates and times
//		ZonedDateTime --> Represents the date and time with a time zone
		
		//LocalDate
		
//	    System.out.println("Current Date "+LocalDate.now());
//		LocalDate date=LocalDate.of(2022, 8,23);
//		String date1="23/03/2019";
//		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate parsedDate=LocalDate.parse(date1,formatter);
//		System.out.println(date);
//		System.out.println(parsedDate);
//		Period period=Period.between(date, parsedDate);
//		System.out.println("Difference between -->"+period);
//		System.out.println(LocalDate.now().minusDays(1));
//		System.out.println(LocalDate.now().minusMonths(2));
		
		//Local Time
		
//		LocalTime currentTime= LocalTime.now();
//		System.out.println("Current Time "+currentTime);
//		LocalTime customTime=LocalTime.of(8, 04);
//		LocalTime parsedTime=LocalTime.parse("12:09");
//		Duration duration=Duration.between(customTime, parsedTime);
//		System.out.println("Duration between times -->"+duration);
//		System.out.println(customTime);
//		System.out.println(parsedTime);
//		System.out.println(parsedTime.minusHours(1));
		
		
//		LocalDateTime
		
//		LocalDateTime currentDateTime=LocalDateTime.now();
//		System.out.println(currentDateTime);
//		
//		LocalDateTime customDateTime=LocalDateTime.of(2021,04,23,4,5);
//		System.out.println(customDateTime);
//		
//		LocalDateTime parsedDateTime=LocalDateTime.parse("2022-03-17T10:09:09");
//		System.out.println(parsedDateTime);
//		
//		Duration durationOfDateTime=Duration.between(customDateTime, parsedDateTime);
//		System.out.println(durationOfDateTime);
		
		// instant now
		Instant i1=Instant.now();
		Thread.sleep(2000);
		Instant i2=Instant.now();
		Duration duration=Duration.between(i1, i2);
		System.out.println(duration);
		
	
		String dateTimeString="2022-04-23 12:44:08 IST";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		ZonedDateTime z1=ZonedDateTime.parse(dateTimeString,formatter);
		System.out.println(z1);
		System.out.println(ZonedDateTime.now());
		
		
	}

}
