import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JUnitTestDriver {

	@Test
	void testOpenWebNPRU() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        WebElement searchInput = driver.findElement(By.name("q"));
        
        searchInput.sendKeys("PWS NPRU");
        
        searchInput.submit();
        //driver.quit();
        
		fail("Not yet implemented");
	}

	
}
