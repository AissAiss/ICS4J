package ICS4J;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ICSparser {
	// Faire une classe static avec une seule méthode
	// qui renvois directement le calendrier correspondant
	// au fichier passer en paramètre
	
	static public ADECalendar getADECalendar(File file){
		ADECalendar cal = new ADECalendar(); 
		
		try {
            @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
            String currentLine;
            
            // TODO : Ne pas supprimer les variables de lecture, 
            //		  on pourra lire d'autres informations plus tard...
            @SuppressWarnings("unused")
            String DTSTAMP;
            String DTSTART;
            String DTEND;
            String SUMMARY;
            String LOCATION;
            String DESCRIPTION;
            String DESC_TMP; 
            @SuppressWarnings("unused")
            String UID;
            @SuppressWarnings("unused")
            String CREATED;
            @SuppressWarnings("unused")
            String LASTMODIFIED;
            @SuppressWarnings("unused")
            String SEQUENCE;
            @SuppressWarnings("unused")
            String END; 
            
            int s_day 		= 0, 	e_day 		= 0; 
            int s_month		= 0, 	e_month 	= 0; 
            int s_year 		= 0, 	e_year 		= 0; 
            int s_hour 		= 0, 	e_hour 		= 0; 
            int s_minute	= 0, 	e_minute 	= 0; 
            
            ADEDate dateDebut 	= new ADEDate(); 
            ADEDate dateFin 	= new ADEDate(); 
            
            ADEEvent event;// = new ADEEvent(); 
            
    		// Enlever les 5 premières lignes du fichier 
    		for(int i = 0; i<5; i++)
    			currentLine = br.readLine(); 
    		
    		// Pour chaque event
            while((currentLine = br.readLine()) != null && currentLine.equals("BEGIN:VEVENT")){
            	
            	// Lire les 11 lignes correspondant et créer l'event 
				DTSTAMP     	= br.readLine(); 
				DTSTART     	= br.readLine(); 
				DTEND        	= br.readLine(); 
				SUMMARY      	= br.readLine(); 
				LOCATION    	= br.readLine(); 
				// TODO : La description peut faire plusieurs lignes... 
				DESCRIPTION   	= br.readLine(); 
				DESC_TMP 		= br.readLine(); 
				
				while(!DESC_TMP.contains("LAST-MODIFIED:")) {
					DESCRIPTION += DESC_TMP; 
					DESC_TMP = br.readLine();  
				}
				
				//UID          		= DESC_TMP; 
				//CREATED   		= br.readLine(); 
				LASTMODIFIED 	= DESC_TMP; 
				SEQUENCE     	= br.readLine(); 
				END          	= br.readLine();
				
				s_year 		= Integer.parseInt(DTSTART.substring( 8, 12)); 
				s_month 	= Integer.parseInt(DTSTART.substring(12, 14)); 
				s_day		= Integer.parseInt(DTSTART.substring(14, 16)); 
				s_hour 		= Integer.parseInt(DTSTART.substring(17, 19)); 
				s_minute 	= Integer.parseInt(DTSTART.substring(19, 21)); 
				
				e_year 		= Integer.parseInt(DTEND.substring( 6, 10)); 
				e_month 	= Integer.parseInt(DTEND.substring(10, 12)); 
				e_day		= Integer.parseInt(DTEND.substring(12, 14)); 
				e_hour 		= Integer.parseInt(DTEND.substring(15, 17)); 
				e_minute 	= Integer.parseInt(DTEND.substring(17, 19));
				
				
				dateDebut = new ADEDate(s_day, s_month, s_year, s_hour, s_minute); 
				dateFin   = new ADEDate(e_day, e_month, e_year, e_hour, e_minute); 
				
				event = new ADEEvent(dateDebut, dateFin, SUMMARY, LOCATION, DESCRIPTION);
				
            	cal.addEvent(event);
            }
        }catch (IOException e){
        	System.out.println("PB lecture du fichier");
        }
		return cal;
	}
}