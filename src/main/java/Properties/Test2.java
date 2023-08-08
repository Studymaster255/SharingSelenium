package Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		FileReader reader = null;
        FileWriter writer = null;

        File file = new File("F:\\AfterJoining\\Selenium\\resources\\db.properties");

        try {
            reader = new FileReader(file);
            writer = new FileWriter(file);

            Properties p = new Properties();
            p.load(reader);

            p.setProperty("name","john");
            p.store(writer,"write a file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
