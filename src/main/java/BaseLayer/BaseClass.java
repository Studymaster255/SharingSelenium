package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop=null;
	public static WebDriver driver=null;
	public BaseClass()
	{
		final String path = System.getProperty("user.dir") + 
				"\\src\\main\\java\\ConfigLayer\\config.properties";
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initilization()
	{
//		switch(prop.getProperty("browser"))
//		{
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//			break;
//
//		case "edge" :
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		default :
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("disable-infobars");
			//options.addArguments("incognito");
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
//			break;
//		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		//driver.get(prop.getProperty("url"));
	}
}


