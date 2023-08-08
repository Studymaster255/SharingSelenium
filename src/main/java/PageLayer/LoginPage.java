package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='username']")
	WebElement unamefld;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passfld;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	public LoginPage()
	{   
       // PageFactory.initElements(driver, this);
    }
	
	public void usernameFild(String username)
	{
		unamefld.sendKeys(username);
	}
	
	public void passwordFild(String pass)
	{
		passfld.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		loginbtn.click();
	}
	
	
	
	

}
