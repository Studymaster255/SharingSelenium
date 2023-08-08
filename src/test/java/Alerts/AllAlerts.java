package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class AllAlerts extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		WebElement id=driver.findElement(By.xpath("//input[@name='cusid']"));

		id.sendKeys("123456");//sending data in textfield

		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));

		submit.click();//clicking submit button then we will get alert popup

		Alert alert = driver.switchTo().alert();//switching to alert popup

		Thread.sleep(3000);

		alert.accept();//accepting alert popup

		Thread.sleep(5000);

		Alert alert1 = driver.switchTo().alert();//switching to alert popup

		alert1.accept();//accepting alert popup

		

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('auth_login_password').setAttribute('value', val );");

		//driver.ExecuteScript(string.Format("document.getElementById('cred-password-inputtext').value='{0}';",password));

		

		

		//driver.quit();//closing session.
	}

}
