package chap4.javaapis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class DateTimeTests {

	public static void main(String[] args) {
		// LocalDate
		// Creating LocalDate
		System.out.println("***	Creating LocalDate	***");
		LocalDate d1 = LocalDate.of(2013, 7, 22);
		LocalDate d2 = LocalDate.of(2013, Month.JULY, 22);
		LocalDate d3 = LocalDate.now();
		LocalDate d4 = LocalDate.parse("2013-07-22");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		// Quering LocalDate
		System.out.println("***	Quering LocalDate	***");
		LocalDate d5 = LocalDate.parse("2020-08-30");
		System.out.println(d5.getDayOfMonth());
		System.out.println(d5.getDayOfYear());
		System.out.println(d5.getDayOfWeek());
		System.out.println(d5.getMonth());
		System.out.println(d5.getMonthValue());
		System.out.println(d5.getYear());
		System.out.println(d1.isAfter(d5));
		System.out.println(d1.isBefore(d5));
		// Manipulating LocalDate
		System.out.println("***	Manipulating LocalDate	***");
		LocalDate d6 = LocalDate.of(2052, 03, 10);
		System.out.println(d6.minusDays(10));
		System.out.println(d6.minusMonths(2));
		System.out.println(d6.minusWeeks(30));
		System.out.println(d6.minusYears(1));
		System.out.println(d6.plusDays(10));
		System.out.println(d6.plusMonths(2));
		System.out.println(d6.plusWeeks(4));
		System.out.println(d6.plusYears(1));
		System.out.println(d6.withDayOfMonth(20));
		System.out.println(d6.withDayOfYear(365));
		System.out.println(d6.withMonth(5));
		System.out.println(d6.withYear(2070));

		// Converting to another type
		System.out.println("***	Converting LocalDate	***");
		System.out.println(d6.atTime(10, 30));
		System.out.println(d6.atTime(23, 30, 29));

		// LocalDateTime
		// Manipulating LocalDateTime
		System.out.println("\n***	Creating LocalDateTime	***");
		LocalDateTime dt1 = LocalDateTime.of(2014, 03, 23, 16, 20, 11);
		System.out.println(dt1);
		LocalDateTime prizeCeremony = LocalDateTime.parse("2050-04-02T12:23:33");
		LocalDateTime dateTimeNow = LocalDateTime.now();
		if (prizeCeremony.getMonthValue() == 6)
			System.out.println("Can't invite president");
		else
			System.out.println("President invited");

		LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");
		if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
			System.out.println("Chief Guest will leave before ceremony completes");
		LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
		if (eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
			System.out.println("Manager is supposed to arrive 3 hrs earlier");

		// LocalTime
		// Creating LocalTime
		System.out.println("\n***	Creating LocalTime	***");
		LocalTime timeHrsMin = LocalTime.of(12, 12);
		LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
		LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);
		LocalTime t1 = LocalTime.parse("11:20:10");
		System.out.println(t1);
		System.out.println(t1.atDate(d6));

		// Period
		// Creating Period
		System.out.println("\n***	Creating Period	***");
		Period p1 = Period.ofDays(35); // not converted to 1month5days !
		Period p2 = Period.ofDays(-15); // shows P-15D
		Period p3 = Period.of(2018, 03, 30); // shows P2018Y3M30D
		Period p4 = Period.ofMonths(13);// shows P13M
		Period p5 = Period.ofYears(3);// shows P3Y
		Period p6 = Period.ofWeeks(3);// shows P21D // converted automatically to nbr of Days
		Period p7 = Period.ofWeeks(5);// shows P35D
		Period p8 = Period.parse("P3Y4M24D"); // shows P3Y4M24D
		Period p9 = Period.parse("P5y"); // shows P5Y
		Period p10 = Period.parse("p5Y"); // shows P5Y
		Period p11 = Period.parse("p+5y"); // shows P5Y
		Period p12 = Period.parse("p-5y"); // shows P-5Y
		Period p13 = Period.parse("-p8Y6m15D");// shows P-8Y-6M-15D
		Period p14 = Period.parse("p35d"); // shows P35D
		Period p15 = Period.parse("P6W"); // shows P42D
		Period p16 = Period.parse("-P6W"); // shows P-42D
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);
		System.out.println(p8);
		System.out.println(p9);
		System.out.println(p10);
		System.out.println(p11);
		System.out.println(p12);
		System.out.println(p13);
		System.out.println(p14);
		System.out.println(p15);
		System.out.println(p16);

		LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
		LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
		Period periodBetween = Period.between(carnivalStart, carnivalEnd); // P2D
		System.out.println(periodBetween);

		// MANIPULATING LOCALDATE AND LOCALDATETIME USING PERIOD
		LocalDate d7 = LocalDate.of(2052, 01, 31);
		// Period implements interface TemporalAmount
		System.out.println(d7.plus(Period.ofDays(1)));// shows 2052-02-01
		LocalDate d8 = LocalDate.of(2052, 01, 31);
		System.out.println(d8.minus(Period.ofWeeks(5)));// shows 2051-12-27 !!!!
		Period days5 = Period.of(0, 0, 5);
		System.out.println(days5.isZero());// false
		Period daysMinus5 = Period.of(0, 0, -5);
		System.out.println(daysMinus5.isNegative());// true
		Period year1Month9Day20 = Period.of(1, 9, 20);
		// multiplies each element in the period by the integer parameter 2
		System.out.println(year1Month9Day20.multipliedBy(2)); // P2Y18M40D
		System.out.println(year1Month9Day20.multipliedBy(-2)); // P-2Y-18M-40D

		Period period5Month = Period.of(0, 5, 0);
		Period period10Month = Period.of(0, 10, 0);
		Period period10Days = Period.of(0, 0, 10);
		System.out.println(period5Month.plus(period10Month));// P15M
		System.out.println(period10Days.plusDays(35));// P45D
		System.out.println(period10Month.plusMonths(5));// P15M
		System.out.println(period10Days.plusYears(5));// P5Y10D
		// converting to months
		System.out.println(Period.of(10, 5, 40).toTotalMonths()); // 125

		// Quering Period
		Period p17 = Period.of(2, 4, 40);// shows P2Y4M40D
		System.out.println(p17);
		System.out.println(p17.getYears());
		System.out.println(p17.getMonths());
		System.out.println(p17.getDays());

		// DateTimeFormatter
		// Creating DateTimeFormatter by 3 ways
		System.out.println("\n***	Creating DateTimeFormatter	***");
		// using ofXXX method
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
		DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
		// using static fields
		DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
		// using ofPattern method
		DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("yyyy MM dd");

		// Formating a date/time using format() method of DateTimeFormatter
		LocalDate date = LocalDate.of(2057, 8, 11);
		System.out.println(formatter1.format(date)); // Aug 11, 2057

		LocalDate d9 = LocalDate.of(2057, 8, 11);
		LocalTime t2 = LocalTime.of(14, 30, 15);
		DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("y");// 2057
		DateTimeFormatter dt3 = DateTimeFormatter.ofPattern("YYYY");// 2057
		DateTimeFormatter dt4 = DateTimeFormatter.ofPattern("Y M D");// 2057 8 223
		DateTimeFormatter dt5 = DateTimeFormatter.ofPattern("e");// 1
		DateTimeFormatter dt6 = DateTimeFormatter.ofPattern("H h m s");// 14 2 30 15
		DateTimeFormatter dt7 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");// Time now:14 30 PM
		System.out.println(dt2.format(date));
		System.out.println(dt3.format(date));
		System.out.println(dt4.format(date));
		System.out.println(dt5.format(date));
		System.out.println(dt6.format(t2));
		System.out.println(dt7.format(t2));

		// Parsing using LocalDate's parse() method 
		DateTimeFormatter dt8 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate d10 = LocalDate.parse("2057-01-29", dt8);
		System.out.println(d10);
		// Formating using LocalDate's format() method and FR pattern
		DateTimeFormatter dt9 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(d9.format(dt9)); // 11-08-2057
		

		
	}
}
