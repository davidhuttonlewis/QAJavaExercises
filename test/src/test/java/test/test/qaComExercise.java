package test.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaComExercise {

	@Test
	public void testGoogleSearch() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");

		WebDriver cdriver = new ChromeDriver();
		cdriver.get("http://www.qa.com");

		Thread.sleep(5000); // Let the user actually see something!
		String URL = cdriver.getCurrentUrl();
		assertEquals(URL, "https://www.qa.com/");
		Thread.sleep(5000); // Let the user actually see something!

		cdriver.quit();
	}

}
