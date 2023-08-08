package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.DropDown;

public class Dropdown extends BaseClass{
	public static void main(String[] args) {
		BaseClass.initilization();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		DropDown hdd=new DropDown();

		WebElement counntrydd=driver.findElement(By.xpath("//select[@name='country']"));

		hdd.dropdownByVisibleText(counntrydd, "INDIA");

		//System.out.println(hdd.checkSelectedValue());

		hdd.printAllValuesFromDropdown(counntrydd);

		driver.quit();
	}

}
