package ICS4J;
import java.util.Vector;

/**
 * @author lucasaissaoui
 *
 */
public class ADECalendar {
	private Vector<ADEEvent> Events;

	
	public ADECalendar() {
		super();
		this.Events = new Vector<ADEEvent>();  
	}
	
	/**
	 * @param Events
	 */
	public ADECalendar(Vector<ADEEvent> Events) {
		super();
		this.Events = Events;
	}
	
	/**
	 * @param Event
	 */
	public void addEvent(ADEEvent Event) {
		this.Events.add(Event);
	}
	
	
	/**
	 * @param index
	 * @return ADEEvent
	 */
	public ADEEvent getEvent(int index) {
		if(index < this.Events.size())
			return this.Events.get(index); 
		else 
			return this.Events.lastElement();
	}
	
	/**
	 * @return Events
	 */
	public Vector<ADEEvent> getAllEvent(){
		return this.Events; 
	}
	
	public void printAllEvent(){
		for(ADEEvent event : this.Events) {
			System.out.println(event.toString()); 
		}
		
		System.out.println(Events.size()); 
	}
}
