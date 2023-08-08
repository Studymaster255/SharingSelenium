import java.io.File;
import java.util.Scanner;

public class MakeFolder {

	public static void main(String[] args) {
		System.out.println("Enter the path where you want to create a folder: ");  
	      Scanner sc = new Scanner(System.in);  
	      String path = sc.next();  
	      //Using Scanner class to get the folder name from the user  
	      System.out.println("Enter the name of the desired a directory: ");  
		File f1 = new File(path);  
	      //Creating a folder using mkdir() method  
	      boolean bool = f1.mkdir();  
	      if(bool){  
	         System.out.println("Folder is created successfully");  
	      }else{  
	         System.out.println("Error Found!");  
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
