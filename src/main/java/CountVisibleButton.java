import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountVisibleButton{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.freepik.com/free-photos-vectors/website-button");
		List<WebElement> btnlist=driver.findElements(By.xpath("//button"));
		int count=0;
		for(int i=0;i<btnlist.size();i++)
		{
			if(btnlist.get(i).isDisplayed())
			{
				count++;
			}
		}
		System.out.println("Total buttons on the page= "+btnlist.size());
		System.out.println("Visible bittons on the page= "+count);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
