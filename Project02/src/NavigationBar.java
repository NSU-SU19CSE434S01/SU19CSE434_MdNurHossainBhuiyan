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
class NavigationBar {

	@Test
public void isToursPageOpenWhenClickTours(){
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/tours");
		// Find "Tours" link
		WebElement tours = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'Tours')]"));
		
		// Click "Tours" link
		tours.click();
		
		// Wait until page is loaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Tours Listings"));
		String expected="Tours Listings";
		assertEquals(expected, driver.getTitle());
		// Verify page title
		
	}
	
	
	
	
	

}
