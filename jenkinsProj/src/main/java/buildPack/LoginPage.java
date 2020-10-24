package buildPack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	RemoteWebDriver driver;

	@Test
	public void loginSteps() throws InterruptedException {
		
		String browser = System.getProperty("browser");
		System.out.print(browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElementByXPath("//input[@type='email']").sendKeys("avinashnatikar28@gmail.com");
		driver.findElementByXPath("//span[contains(text(),'Next')]/parent::button").click();
		Thread.sleep(3000);
		driver.close();
	}

}
