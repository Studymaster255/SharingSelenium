package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ClickOnElement extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		

		Actions action=new Actions(driver);

		action.sendKeys(Keys.ESCAPE);

		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));//locating the element for context click

		//Right click on element

		action.contextClick(rightclick).build().perform();

		Thread.sleep(2000);//

		action.click(driver.findElement(By.xpath("//span[text()='Copy']"))).build().perform();//clicking on copy that is internal element of context click

		Thread.sleep(2000);

		driver.switchTo().alert().accept();//accepting an alert popup generated after clicking copy

		Thread.sleep(3000);

		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));//locating the element for right click

		//double click on element

		action.doubleClick(doubleclick).build().perform();

		Thread.sleep(2000);

		driver.switchTo().alert().accept();//accepting an alert popup generated after double clicking

		driver.quit();

	}

}
