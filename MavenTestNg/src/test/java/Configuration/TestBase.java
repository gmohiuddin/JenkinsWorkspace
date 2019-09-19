package Configuration;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	
	public static void initialize() {
		if(driver == null) {
			if(Constants.browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:/Selenium/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(Constants.browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver","C:/Selenium/Drivers/IEDriverServe.exe");
			}
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.url);
	}
	
	public static void quit() {
		System.out.println("quitting the browser");
		driver.quit();
		driver = null;
	}
	
	public static void close() {
		System.out.println("quitting the browser");
		driver.close();
		driver = null;
	}

}