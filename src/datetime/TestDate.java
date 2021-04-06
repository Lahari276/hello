package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
// import java.time.temporal.ChronoUnit;

public class TestDate {
public static void main(String[] args) {
	ZoneId zone = ZoneId.systemDefault();
	System.out.println(zone);
	ZoneId offZoneId = ZoneId.of("America/Los_Angels");
	ZonedDateTime zdt = ZonedDateTime.now(offZoneId);
	System.out.printf(" date and time ",zdt);
	/*
	Year year = Year.of(2020);
	if(year.isLeap()) {
		System.out.println("leap year");
	}
	else {
		System.out.println("not leap year");
	}*/
	/*LocalDate ld = LocalDate.now();
	LocalDate dob = LocalDate.of(2000, 06, 27);
	Period p = Period.between(dob, ld);
	LocalDate lastday = dob.plusYears(60);
	Period pleft = Period.between(ld, lastday);
	System.out.printf("no of yrs = %d, no of months = %d, no of days = %d\n",p.getYears(),p.getMonths(),p.getDays());
	System.out.printf("no of yrs left = %d, no of months left = %d, no of days left = %d",pleft.getYears(),pleft.getMonths(),pleft.getDays());

	*/
	/*int day = ld.getDayOfMonth();
	int date = ld.getDayOfYear();
	LocalDateTime ldt = LocalDateTime.now();
	LocalTime lt = LocalTime.now();
	System.out.println(day + " " + date + "  " + ldt + "  " + lt.plusHours(5));
	ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
    LocalTime time1 = LocalTime.now(zone1);  
    System.out.println("India Time Zone: "+time1);  
    LocalTime time2 = LocalTime.now(zone2);  
    System.out.println("Japan Time Zone: "+time2);  
    long hours = ChronoUnit.HOURS.between(time1, time2);  
    System.out.println("Hours between two Time Zone: "+hours);  
    long minutes = ChronoUnit.MINUTES.between(time1, time2);  
    System.out.println("Minutes between two time zone: "+minutes);*/
}
}
