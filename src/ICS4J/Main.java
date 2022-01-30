package ICS4J;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("ADECal.ics"); 
		ADECalendar cal = ICSparser.getADECalendar(file);
		cal.printAllEvent();
	}

}
