import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class FeatureHotel {

	@Test
	void test() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		 // Maximize the browser window
		  driver.manage().window().maximize();
		  
		  // Navigate to the http://phptravels.net/
		  driver.get("http://phptravels.net/");
		  
		  // set implicitly timeout to 10 seconds
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Wait until element to be clickable
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='top']//div/a[@href='http://phptravels.net/hotels/singapore/singapore/Rendezvous-Hotels']")));
		  
		  // Find hotel
		  WebElement hotel = driver.findElement(By.xpath("//*[@id='top']//div/a[@href='http://phptravels.net/hotels/singapore/singapore/Rendezvous-Hotels']"));
		  
		  // Create instance of JavascriptExecutor
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  // Click hotel
		  js.executeScript("arguments[0].click();", hotel);
		  
		  // Wait and verify page title
		  wait.until(ExpectedConditions.titleContains("Rendezvous Hotels"));
		  String expected="Rendezvous Hotels";
		  assertEquals(expected, driver.getTitle());

	}

}
