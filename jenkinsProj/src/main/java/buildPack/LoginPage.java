package buildPack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	@Test
	public void loginSteps() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElementByXPath("//input[@type='email']").sendKeys("avinashnatikar28@gmail.com");
		driver.findElementByXPath("//span[contains(text(),'Next')]/parent::button").click();
		Thread.sleep(3000);
		driver.close();
	}

}
