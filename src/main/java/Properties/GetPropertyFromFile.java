package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyFromFile {
	final static String path = System.getProperty("user.dir") + 
			"\\src\\main\\java\\Properties\\Myproperty.properties";
	public static void main(String[] args) {
		Properties prop=new Properties();
		try {
			//To provide path of properties file
			FileInputStream fis=new FileInputStream(path);
			//Reads a property list (key and element pairs) from the inputbyte stream
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//get property using key
		System.out.println(prop.getProperty("path1"));
		prop.setProperty("abcz1", "xyzz");
		try {
			prop.store(new FileOutputStream(new File(path)), "massage");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
