import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Search {

	@Test
	void test() {
		//System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NHBSOHEL\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net");
		
		driver.findElement(By.className("select2-input")).sendKeys("bali");
		driver.findElement(By.xpath("//*[@id=\'thhotels\']/form/div[5]/button")).click();
	}

}
