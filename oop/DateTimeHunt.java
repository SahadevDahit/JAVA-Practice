package oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateTimeString="2023-04-24 10:30:45 IST";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		
		ZonedDateTime zonedDateTime=ZonedDateTime.parse(dateTimeString, formatter);
//		System.out.println(zonedDateTime);
		
		    LocalDate startDate = LocalDate.of(2024, 1, 1);
	        LocalDate endDate = LocalDate.of(2024, 6, 30);
	        Period period=Period.between(startDate, endDate);
	        System.out.println(period);
	        		
		LocalDateTime currentDateTime=LocalDateTime.now();
//		System.out.println(currentDateTime);
		
		LocalDateTime myDateTime=LocalDateTime.of(2024,06,23,14,15,20);
		
		LocalDateTime myLD=LocalDateTime.parse("2024-03-12T10:04:12");
		
		
		

	}

}
