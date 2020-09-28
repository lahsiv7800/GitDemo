package coding_Practice;

import java.net.HttpURLConnection;
import java.net.URL;
//import org.apache.commons.io.FilenameUtils;

import com.sun.jna.platform.FileUtils;
public class HTTPStatuscodes {
	
	public static void main(String[] args)
    {
        try
        {
            URL url = new URL("https://en.wikipedia.org/wiki/Special:Search?search=sharuk+khan&go=Go&ns0=1");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int code = connection.getResponseCode(); 
            Object content=connection.getContent();
            String con=connection.getContentEncoding();
            //System.out.println(content);
            System.out.println("code: "+code);
            
        }
        catch(Exception e)
        {
        	System.out.println("Status code not found");
        }

    }

}
