package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.Frames;

public class FrameByWebElement extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		Frames frame=new Frames();
		BaseClass.initilization();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement packageListFrame=driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
		WebElement packageFrame=driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
		WebElement classFrame=driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		//switchin to frame One
		frame.frameByWebElement(packageListFrame);//switching focus to packageListFrame
		//locating element from packageListFrame
		WebElement seleniumFromFrameOne=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']"));
		Thread.sleep(2000);
		seleniumFromFrameOne.click();//clicking on element from frame One
		//switching to parent frame
		frame.switchToDefaultContent();
		//switchin to frame Teo
		frame.frameByWebElement(packageFrame);
		//locating element from ClassesFrame
		WebElement seleniumFromFrameTwo=driver.findElement(By.xpath("//a[text()='ChromeOptions']"));
		Thread.sleep(2000);
		seleniumFromFrameTwo.click();//clicking on element from frame Two
		//switching to parent frame
		frame.switchToDefaultContent();
		//switchin to frame Three
		frame.frameByWebElement(classFrame);
		//locating element from Overview
		WebElement seleniumFromFrameThree=driver.findElement(By.xpath("//a[text()='Capabilities']"));
		Thread.sleep(2000);
		seleniumFromFrameThree.click();//clicking on element from frame Three
		
		
		

	}

}
