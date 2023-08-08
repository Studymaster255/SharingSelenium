package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class MouseHoverEvent extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization();

		driver.get("https://www.browserstack.com/");

		Thread.sleep(2000);

		WebElement product=driver.findElement(By.xpath("//button[text()='Products' and @id='product-menu-toggle']"));

		Actions action=new Actions(driver);//creating instance of actions class

		action.moveToElement(product).build().perform();//Hovering mouse on product button

		System.out.println(driver.getTitle());

		WebElement accTest=driver.findElement(By.xpath("(//div[@class='dropdown-link-heading' and text()=' Accessibility Testing '])[1]"));

		action.click(accTest).build().perform();

		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
