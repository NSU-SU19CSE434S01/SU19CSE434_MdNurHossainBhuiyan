import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
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
class HeaderTop {

	
	//phone
	@Test
	public void isPhoneNumberCorrect() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");

		// Find div with phone number
		WebElement phoneNumberDIV = driver.findElement(By.xpath("//div[contains(@class,'header-phone')]"));
	
		assertEquals(phoneNumberDIV.getText(), "+123-456-789");
		driver.quit();
	
	
	}
//email test
	
	@Test
	public void isEmailTextCorrect() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");

		// Find div with email
		WebElement emailDIV = driver.findElement(By.xpath("//div[contains(@class,'header-email')]"));

		// Verify if email text is correct
		assertEquals(emailDIV.getText(), "info@travelagency.com");
		driver.quit();

	}
	

}
