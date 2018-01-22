package test.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {

	@Test
	public void testGoogleSearch() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magicmadhouse.co.uk/");

		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("http://www.google.com/xhtml"); Thread.sleep(5000); // Let the
		 * user actually see something! WebElement searchBox =
		 * driver.findElement(By.name("q")); searchBox.sendKeys("Revan");
		 * searchBox.submit(); Thread.sleep(5000); // Let the user actually see
		 * something! WebElement imageBox = driver.findElement(By.className("qs"));
		 * imageBox.click(); Thread.sleep(5000); driver.quit();
		 */
	}

}