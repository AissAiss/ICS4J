package ICS4J;

public class ADEDate {
	// Date
	public int day; 
	public int month; 
	public int year; 
	
	// Heure; 
	public int hour; 
	public int minute; 
	
	public ADEDate(int day, 
				   int month, 
				   int year, 
				   int hour, 
				   int minute) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
	}
	
	public ADEDate() {
		this(0, 0, 0, 0, 0); 
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	@Override
	public String toString() {
		String dd = (day 	< 10)? "0" + Integer.toString(day)		: Integer.toString(day); 
		String mo = (month 	< 10)? "0" + Integer.toString(month)	: Integer.toString(month); 
		String yy = (year 	< 10)? "0" + Integer.toString(year)		: Integer.toString(year);
		
		String hh = (hour 	< 10)? "0" + Integer.toString(hour)		: Integer.toString(hour);
		String mn = (minute < 10)? "0" + Integer.toString(minute)	: Integer.toString(minute);
		
		
		return "ADEDate [" + dd + "/" + mo + "/" + yy + " " + hh + ":" + mn + "]";
	} 
	
	
	
	
	

}
