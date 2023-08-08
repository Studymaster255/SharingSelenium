package Properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		 Properties properties = new Properties();
		 java.net.URL url = ClassLoader.getSystemResource("db.properties");
		 try  {
	            properties.load(url.openStream());
	        } catch (FileNotFoundException fie) {
	            fie.printStackTrace();
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        System.out.println(properties.getProperty("hostname"));
	        Set<String> keys = properties.stringPropertyNames();
	        for (String key : keys) {
	            System.out.println(key + " - " + properties.getProperty(key));
	        }
	}

}
