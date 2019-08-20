import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class FeatureTours {

	@Test
	void test() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		
		// Wait until element to be invisibility
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='collapse1']//div/a[@href='http://phptravels.net/tours/malasia/legoland/Legoland-Malaysia-Day-Pass']")));
		    
		  // Find tour
		  WebElement tour = driver.findElement(By.xpath("//*[@id='collapse1']//div/a[@href='http://phptravels.net/tours/malasia/legoland/Legoland-Malaysia-Day-Pass']"));
		  
		  // Create instance of JavascriptExecutor
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  // Scroll to tour and click
		  js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", tour);
		  
		  // Wait and verify page title
		  wait.until(ExpectedConditions.titleContains("Legoland Malaysia Day Pass"));
		  String expected="Legoland Malaysia Day Pass";
		  assertEquals(expected, driver.getTitle());
	}

}
