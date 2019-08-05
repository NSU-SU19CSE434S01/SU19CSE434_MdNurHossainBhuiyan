import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Login {

	@Test
	void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NHBSOHEL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.id("remember-me")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/form/button")).click();
		
	}

}
