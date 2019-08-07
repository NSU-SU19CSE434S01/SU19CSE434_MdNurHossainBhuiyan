import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Signup {

	@Test
	void test() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\NHBSOHEL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.phptravels.net/register");
		driver.findElement(By.name("firstname")).sendKeys("nhb");
		driver.findElement(By.name("lastname")).sendKeys("Sohel");
		driver.findElement(By.name("phone")).sendKeys("01818950047");
		driver.findElement(By.name("email")).sendKeys("nhbsohel@gmail.com");
		driver.findElement(By.name("password")).sendKeys("76435&&76435");
		driver.findElement(By.name("confirmpassword")).sendKeys("76435&&76435");
		driver.findElement(By.className("signupbtn")).click();
		System.out.println("Sign Up Test Successful");
		
	}

}
