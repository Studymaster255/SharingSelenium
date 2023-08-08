package HandleWindow;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.HandleWindowMethod;

public class HandleWindowExamples extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization();
		driver.get("https://www.amazon.in/");
		//getting title of currant window
		System.out.println(driver.getTitle());
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//locating searchbox
		searchBox.sendKeys("Mobile",Keys.ENTER);//sending string in searchBox and submitting using keyboard action
		//storing id of parent window
		String parentId=driver.getWindowHandle();
		//locating element and clicking on it and it will open into new window
		WebElement firstMob=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		firstMob.click();
		System.out.println(driver.getTitle());//now our focus winbdow is firstOne
		//capturing all window id and storing into Set
		Set<String> allWin=driver.getWindowHandles();
		//logic to switching from one window to another window
		for(String a:allWin)
		{
			if(parentId!=a)
			{
				//switching to another window
				driver.switchTo().window(a);
				//getting title of currant window
				System.out.println(driver.getTitle());
			}
		}
		//driver.close();//will close currant focused window
		//driver.quit();//will close all windows
	}
}
