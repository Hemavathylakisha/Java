package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateandTimeLocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LOCAL TIME
		LocalTime time=LocalTime.now();
		System.out.println(time);
	    LocalTime t1 = LocalTime.of(12, 10,43);//hh:mm:ss
	    System.out.println(t1);
	    System.out.println(LocalTime.parse("10:23:23"));
	    
	    System.out.println("hours "+time.getHour());
	     System.out.println("min "+time.getMinute());
	     System.out.println("sec "+time.getSecond());
	     
	     System.out.println("plus hours = "+time.plusHours(1));
	     System.out.println("plus  min = "+time.plusMinutes(10));
	     System.out.println("plus sec = "+time.plusSeconds(3));
	     
	     System.out.println("minus hours "+ time.minusHours(3));
	     System.out.println("minus min = "+time.minusMinutes(20));
	     System.out.println("minus sec = "+time.minusSeconds(10));
	     
//	     LocalTime t2 = LocalTime.of(23, 60,43);
//	     System.out.println(" exception = "+t2);

	     //LOCAL DATE
	     LocalDate current = LocalDate.now();
	     System.out.println("Current: " + current);
		 System.out.println(LocalDate.parse("2011-04-11"));		//doubt
		// System.out.println(LocalDate.parse("2011/04/11"));

		 System.out.println(LocalDate.of(2020, 03, 11));
			LocalDate sample = LocalDate.parse("2011-04-11");
			System.out.println("Year: " + current.getYear());
			System.out.println("Month: " +current.getMonth());
			System.out.println("Date: " + current.getDayOfYear());
			System.out.println("Date: " + current.getDayOfMonth());
			System.out.println("Day: "+current.getDayOfWeek());
			
			System.out.println("\nSample Date: " + sample.getDayOfYear()); //doubt
			System.out.println("Sample Date: " + sample.getDayOfMonth());
			
			System.out.println("Current date Plus: (6) -> " + current.plusDays(6));
			System.out.println("Current months Plus: (3) -> " + current.plusMonths(3));
			System.out.println("Current year Plus: (9) -> " + current.plusYears(8));
			System.out.println("\nCurrent date minus: (17) -> "+ current.minusDays(17));
			System.out.println("Current month minus: (15) -> "+ current.minusMonths(15)); //doubt
			System.out.println("Current year minus: (4) -> "+ current.minusYears(4));
			
			System.out.println("\nBoolean methods:");
			System.out.println("current.isAfter(sample) " + current.isAfter(sample));
			System.out.println("current.isBefore(sample) "+current.isBefore(sample));

			LocalDate sample1 = LocalDate.parse("2012-04-11");
			System.out.println("\n2026: " + current.isLeapYear());
			System.out.println("2012: " + sample1.isLeapYear());
			
			//LocalDateTime is a Java class (java.time package) that stores:
			
			//LocalDateTime.now()

			// current date and time
			
			LocalDateTime dt = LocalDateTime.now();
			System.out.println(dt);
			
			System.out.println(dt.getYear());        // Year
			System.out.println(dt.getMonth());       // Month name
			System.out.println(dt.getDayOfMonth());  // Day
			System.out.println(dt.getHour());        // Hour
			System.out.println(dt.getMinute());

			System.out.println(dt.plusDays(5));
			System.out.println(dt.minusHours(3));
			
			System.out.println(dt.toLocalDate());
			System.out.println(dt.toLocalTime());
			
			
			LocalDateTime dtt=LocalDateTime.of(2025,5,3,8,30);
			System.out.println(dtt);
			
			System.out.println(dtt.getYear());        // Year
			System.out.println(dtt.getMonth());       // Month name
			System.out.println(dtt.getDayOfMonth());  // Day
			System.out.println(dtt.getHour());        // Hour
			System.out.println(dtt.getMinute());

			System.out.println(dtt.plusDays(5));
			System.out.println(dtt.minusHours(3));
			
			System.out.println(dtt.toLocalDate());
			System.out.println(dtt.toLocalTime());
			
			//ZonedDateTime
			
			//ZonedDateTime = Date + Time + Timezone
			
			ZonedDateTime zn=ZonedDateTime.now();
			
			System.out.println(zn);
			
			System.out.println(zn.getZone());
			System.out.println(zn.getOffset());
			System.out.println(zn.toLocalDateTime());

			ZoneId india  = ZoneId.of("Asia/Kolkata");
			ZoneId usa    = ZoneId.of("America/New_York");
			ZoneId uk     = ZoneId.of("Europe/London");
			ZoneId japan  = ZoneId.of("Asia/Tokyo");
			
			ZoneId.getAvailableZoneIds().forEach(System.out::println);
			
			System.out.println("************************************");

			ZoneId usa1 = ZoneId.of("America/New_York");
			ZonedDateTime zn1=ZonedDateTime.now(usa1);
			System.out.println(zn1);
			
			System.out.println(zn1.getZone());
			System.out.println(zn1.getOffset());
			System.out.println(zn1.toLocalDateTime());

	}

}
