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
		driver.quit();
		// Verify page title
		
	}
	
	// Hotel
	
	
	@Test
	public void isHotelsPageOpenWhenClickHotels(){
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		
		// Find "Hotels" link
		WebElement hotels = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'Hotels')]"));
		
		// Click "Hotels" link
		hotels.click();
		
		// Wait until page is loaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Hotels Listings"));
		
		String expected="Hotels Listings";
		assertEquals(expected, driver.getTitle());
		driver.quit();
	}
	
	//blog
	
	@Test
	public void isBlogPageOpenWhenClickBlog(){
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		
		// Find "Blog" link
		WebElement blog = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'Blog')]"));
		
		// Click "Blog" link
		blog.click();
		
		// Wait until page is loaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Blog"));
		String expected="Blog";
		
	assertEquals(expected, driver.getTitle());
	driver.quit();
	}
	
	
	//car
	@Test
	public void isCarsPageOpenWhenClickCars(){
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		
		// Find "Cars" link
		WebElement cars = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'Cars')]"));
		
		// Click "Cars" link
		cars.click();
		
		// Wait until page is loaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Cars Listings"));
		
		// Verify page title
		String expected="Cars Listings";
		
		assertEquals(expected, driver.getTitle());
		driver.quit();
			}
	
	@Test
	public void isOffersPageOpenWhenClickOffers(){
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		
		// Find "Offers" link
		WebElement offers = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'Offers')]"));
		
		// Click "Offers" link
		offers.click();
		
		// Wait until page is loaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Special Offers"));
		
	
		// Verify page title
				String expected="Special Offers";
				
				assertEquals(expected, driver.getTitle());
				driver.quit();
			}
	//flight
	
	
	@Test
	public void isFlightsPageOpenWhenClickFlights(){
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		
		// Find "Flights" link
		WebElement flights = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'Flights')]"));
		
		// Click "Flights" link
		flights.click();
		
		// Wait until page is loaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Flights"));
		
		// Verify page title
		String expected="Flights";
		
		assertEquals(expected, driver.getTitle());
		driver.quit();
	}
	
	
	//login page loading test
	
	@Test
	public void isLoginPageOpenWhenClickLoginFromMyAccount(){
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		
		// Find "My Account" dropdown menu
		WebElement myAccount = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'My Account')]"));
		
		// Click "My Account"
		myAccount.click();
		
		// Find "Login" link
		WebElement login = driver.findElement(By.xpath("//ul[contains(@class, 'navbar-nav')]//a[contains(.,'Login')]"));
		
		// Click "Login" link
		login.click();
		
		// Wait until page is loaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Login"));
		
		// Verify page title
	String expected="Login";
		
		assertEquals(expected, driver.getTitle());
		driver.quit();
		
	}
	

}
