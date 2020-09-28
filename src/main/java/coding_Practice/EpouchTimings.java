
package coding_Practice;
import java.util.*;
import java.text.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;


	
public class EpouchTimings {
	    public static void main(String[] args) throws InterruptedException {
	    	LocalDateTime dateTime = LocalDateTime.ofEpochSecond(1320105600, 0, ZoneOffset.UTC);
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM d,yyyy h:mm,a", Locale.ENGLISH);
	    	String formattedDate = dateTime.format(formatter);
	    	System.out.println(formattedDate);
	    	
	    	
	    	LocalDateTime dateTime1 = LocalDateTime.ofEpochSecond(1320105600, 0, ZoneOffset.UTC).plusYears(1);
	    	DateTimeFormatter localFormatter = DateTimeFormatter.ofPattern("EEEE,MMMM d,yyyy h:mm,a", Locale.ENGLISH);
	    	String formattedDate1 = dateTime1.format(localFormatter);
	    	System.out.println(formattedDate1);
	    	
	    	
	    }
	}

