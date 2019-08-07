import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DatePicker {

	@Test
	void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NHBSOHEL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net");
		String month="August 2019";
		String day="7";
		driver.findElement(By.xpath("//*[@id=\'dpd1\']/div/input")).click();
		Thread.sleep(2000);
		while(true) {
			
			String text=driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if(text.equals(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[3]")).click();
				
			}
			
			
		}
		driver.findElement(By.xpath("//div[13]//tr//td[contains(text(),"+day+")]")).click();
	}

}
