package HandleWindow;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		//selenium 4 new feature
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		//WebElement electronic=driver.findElement(By.xpath("//div[text()='Electronics']"));
		//act.moveToElement(electronic).build().perform();
//		WebElement camera=driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
//		act.moveToElement(camera).build().perform();
//		WebElement dslr=driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"));
//		act.moveToElement(dslr).click().build().perform();
//		act.contextClick(electronic).build().perform();
//		
//		Thread.sleep(3000);
//		
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).build().perform();
		System.out.println(driver.getCurrentUrl());
	}

}
