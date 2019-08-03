import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Title {

	@Test
	void test() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NHBSOHEL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net");
		String expected="PHPTRAVELS | Travel Technology Partner";
		String title=driver.getTitle();
		assertEquals(expected, title, "Success");
		driver.close();
		//System.out.println(title);
		
		/*if(title.equals("PHPTRAVELS | Travel Technology Partner")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Wrong Title");
		}*/
		
		
		
	}

}
