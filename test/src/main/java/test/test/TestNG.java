package test.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestNG {

	ExtentReports report;
	ExtentTest test;

	@Test

	public void testGoogleSearch() throws InterruptedException {
		report = new ExtentReports("C:/Users/Dhutt/Desktop/QASlides/ExtentReports/automationreport.html");

		test = report.startTest("qa.com exercise");
		// System.setProperty("webdriver.chrome.driver",
		// "C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Dhutt/Desktop/QASlides/geckodriver-v0.19.1-win64/geckodriver.exe");

		// WebDriver driver = new ChromeDriver();
		// driver.get("http://www.qa.com");
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.qa.com");
		Thread.sleep(2000); // Let the user actually see something!
		test.log(LogStatus.INFO, "Open Browser");
		// String URL = driver.getCurrentUrl();
		String URL = fdriver.getCurrentUrl();
		Thread.sleep(2000);

		if (URL.equals("https://www.qa.com/")) {
			test.log(LogStatus.PASS, "Verify that we are on qa.com");
		} else {
			test.log(LogStatus.FAIL, "Verify that we are on qa.com");
		}
		Thread.sleep(2000); // Let the user actually see something!

		assertEquals(URL, "https://www.qa.com/");

		report.endTest(test);
		report.flush();
		// driver.quit();
		fdriver.quit();
	}

}