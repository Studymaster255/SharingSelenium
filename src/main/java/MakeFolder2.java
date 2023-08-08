import java.io.File;
import java.util.Scanner;

public class MakeFolder2 {

	public static void main(String[] args) {
		if(new File("I:\\directory").mkdirs())
		{
			System.out.println("Directory created by name ");
		}else
		{
			System.out.println("Directory creation failed");
		}
	}
}
//testing piramid
//what is approch for API as QA lead
//sabita code test -> 45 min brandan
/*
 * TestNG
 * 
 */
