package UtilsLayer;

import org.openqa.selenium.Dimension;

import BaseLayer.BaseClass;

public class NewDimension extends BaseClass {
	/**
	 * newDimention reusable method to change Dimension of the browser
	 * width and height is in pixels.
	 * @param width
	 * @param height
	 */
	public static void newDimention(int width,int height)
	{
		Dimension d = new Dimension(width, height);

		driver.manage().window().setSize(d);
	}
}
