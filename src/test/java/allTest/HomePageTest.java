package allTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import allPages.HomePage;

public class HomePageTest {
	
	HomePage homepage = new HomePage();
	
@Test
	public void gotoUrl() {
		homepage.browserSetUp("chrome");
		homepage.getUrl();
		
	}
	
	
	
}
