package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic {
	WebDriver driver;
	HomePage homepage;
	public void browserSetUp(String browserValue) {
		if (browserValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/selinatanha/eclipse-workspace/Test1/Browser/chromedriver");
			driver = new ChromeDriver();
		}else if(browserValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"");
			driver = new FirefoxDriver();
		}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();	
	}
	
	public void getURL(String url) {
		driver.get(url);
	}
	
}
