package Properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetPropertyInFile {
	final static String path = System.getProperty("user.dir") + 
			"\\src\\main\\java\\Properties\\Myproperty.properties";
	public static void main(String[] args) {
		Properties prop=new Properties();
		//set the property in the properties file
		//prop.setProperty("test110", "test0111");
		prop.put("nnn", "lak");
		try {
			//FileWriter fw = new FileWriter(path);  
			/*Writes this property list (key and element pairs) in this Properties 
			table to the output stream in a format suitable for loading into 
			File
			a Properties table using the load(InputStream) method. */
			prop.store(new FileOutputStream(new File(path)), "massage");
			//prop.store(null, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
