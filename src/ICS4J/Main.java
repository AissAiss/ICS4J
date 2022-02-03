package ICS4J;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	
	public static void testDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
		int day = now.getDayOfMonth(); 
		int month = now.getMonthValue(); 
		int year = now.getYear(); 
		
		System.out.println(day + "/" + month + "/" + year); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("ADECal.ics"); 
		ADECalendar cal = ICSparser.getADECalendar(file);
		
		System.out.println(cal.getDay(cal.getIndexOfCurentDay())); 
	}

}
