import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class FeatureOffer {

	@Test
	void test() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		// Wait until element to be invisibility
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='foo2']/li/a[@href='http://phptravels.net/offers/Hotels-Deals']")));
		    
		  // Find offer
		  WebElement offer = driver.findElement(By.xpath("//*[@id='foo2']/li/a[@href='http://phptravels.net/offers/Hotels-Deals']"));
		  
		  // Create instance of JavascriptExecutor
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  // Scroll to car and click
		  js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", offer);
		  
		  // Wait and verify page title
		  wait.until(ExpectedConditions.titleContains("Hotels Deals"));
		  String expected="Hotels Deals";
		  assertEquals(expected, driver.getTitle());
		
	}

}
