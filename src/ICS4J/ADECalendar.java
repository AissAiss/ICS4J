package ICS4J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
 * @author lucasaissaoui
 *
 */
public class ADECalendar {
	private List<ADEEvent> Events;

	
	public ADECalendar() {
		super();
		this.Events = new ArrayList<ADEEvent>();  
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
			return null;
	}
	
	/**
	 * @return Events
	 */
	public List<ADEEvent> getAllEvent(){
		return this.Events; 
	}
	
	public void sort() {
		Collections.sort(Events, new Comparator<ADEEvent>() {
			@Override
			public int compare(ADEEvent o1, ADEEvent o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		}); 
	}
	
	
	
	public void printAllEvent(){
		for(ADEEvent event : this.Events) {
			System.out.println(event.toString()); 
		}
		
		System.out.println(Events.size()); 
	}
}
