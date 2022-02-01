package ICS4J;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("ADECal.ics"); 
		ADECalendar cal = ICSparser.getADECalendar(file);
		cal.printAllEvents();
		//cal.printAllDays();
		//System.out.println(cal.getEvent(0).getSUMMARY());
		//System.out.println(cal.getEvent(0).getSummary()); 
		//System.out.println(cal.getEvent(0).getLOCATION());
		//System.out.println(cal.getEvent(0).getLocation());
		//System.out.println(cal.getEvent(1).getDESCRIPTION());
		//System.out.println();
		//System.out.println(cal.getEvent(1).getDescription());
	}

}
