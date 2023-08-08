package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class DraggingAndDropingOperation extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions action=new Actions(driver);

		WebElement src=driver.findElement(By.id("draggable"));

		WebElement dest=driver.findElement(By.xpath("(//p[text()='Drop here'])[1]"));

		Thread.sleep(3000);

				//drag and drop a element

		//action.dragAndDrop(src, dest).build().perform();

				//clickAndHold on the mouse courser

		//action.clickAndHold(src).build().perform();

				//release element after hold

		//Thread.sleep(2000);

		//action.release(dest).build().perform();

		//driver.quit();

	}

}
