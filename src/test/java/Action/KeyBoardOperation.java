package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class KeyBoardOperation extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization();
		

		driver.get("https://demoqa.com/text-box");

		Actions action=new Actions(driver);

		WebElement fullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));

		WebElement email=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));

		WebElement presentAdd=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));

	//	WebElement perAdd=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));

		

		fullName.sendKeys("test test123");//sending data in fullname filed

		email.sendKeys("test@test.com");//sending emailid in email filed

		presentAdd.sendKeys("plot no test,street test,city test,state test,country test pin 1234");//sending data in present address filed

		action.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).build().perform();//performing copy operation using keyboard events

		

		presentAdd.sendKeys(Keys.TAB);//performng tab operation using keyboard

		action.keyDown(Keys.CONTROL).sendKeys("V").build().perform();//performing copy operation using keyboard events

 

		

		

		Thread.sleep(3000);

		//driver.quit();

	}

}
