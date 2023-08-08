package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ContextClickAndDoubleClick extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization();
		driver.get("https://www.browserstack.com/");

		System.out.println(driver.getTitle());

		Actions action = new Actions(driver);

		WebElement element = driver.findElement(By.xpath("//a[text()='Get started free']"));

		

		action.moveToElement(element).click().build().perform();

		Thread.sleep(5000);

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
