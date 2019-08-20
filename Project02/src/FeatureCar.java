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

class FeatureCar {

	@Test
	void test() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		// Wait until element to be invisibility
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='top']//div/a[@href='http://phptravels.net/cars/oman/muscat/Toyota-Camry-2015-full-option']")));
		    
		  // Find car
		  WebElement car = driver.findElement(By.xpath("//*[@id='top']//div/a[@href='http://phptravels.net/cars/oman/muscat/Toyota-Camry-2015-full-option']"));
		  
		  // Create instance of JavascriptExecutor
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  // Scroll to car and click
		  js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", car);
		  
		  // Wait and verify page title
		  wait.until(ExpectedConditions.titleContains("Toyota Camry 2015 full option"));
		  String expected="Toyota Camry 2015 full option";
	assertEquals(expected, driver.getTitle());
		  
		
	}

}
