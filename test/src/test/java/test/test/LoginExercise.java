package test.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginExercise {

	ExcelReader reader = new ExcelReader();
	ExtentReports report;
	ExtentTest test;
	LoginHelper loginHelper = new LoginHelper();

	@Test
	public void testGoogleSearch() throws InterruptedException, IOException {
		reader.testDataSetup();
		boolean loginCheck = false;
		WebDriver driver = null;
		report = new ExtentReports("C:/Users/Dhutt/Desktop/QASlides/ExtentReports/automationreport2.html");

		test = report.startTest("qa.com exercise");
		// First data set
		driver = loginHelper.settingBowser(driver, reader.gettestData(2));
		loginHelper.openWebBowser(driver, "http://thedemosite.co.uk/");
		loginHelper.clickHelper(driver, "body > div > center > table > tbody > tr:nth-child(2) > td > div > "
				+ "center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)");
		loginHelper.signInHelper(driver, "username", reader.gettestData(0));
		loginHelper.signInHelper(driver, "password", reader.gettestData(1));
		loginHelper.clickHelper(driver,
				"body > table > tbody > tr > td.auto-style1 > form > div > "
						+ "center > table > tbody > tr > td:nth-child(1) > div > center >"
						+ " table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]");
		loginHelper.clickHelper(driver, "body > div > center > table > tbody > tr:nth-child(2) > td > div > "
				+ "center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)");
		loginHelper.signInHelper(driver, "username", reader.gettestData(0));
		loginHelper.signInHelper(driver, "password", reader.gettestData(1));
		loginHelper.clickHelper(driver,
				"body > table > tbody > tr > td.auto-style1 > form > div > "
						+ "center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > "
						+ "td:nth-child(2) > p > input[type=\"button\"]");
		loginCheck = loginHelper.loginCheck(driver);

		// Second data set
		driver = loginHelper.settingBowser(driver, reader.gettestData(5));
		loginHelper.openWebBowser(driver, "http://thedemosite.co.uk/");
		loginHelper.clickHelper(driver, "body > div > center > table > tbody > tr:nth-child(2) > td > div > "
				+ "center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)");
		loginHelper.signInHelper(driver, "username", reader.gettestData(3));
		loginHelper.signInHelper(driver, "password", reader.gettestData(4));
		loginHelper.clickHelper(driver,
				"body > table > tbody > tr > td.auto-style1 > form > div > "
						+ "center > table > tbody > tr > td:nth-child(1) > div > center >"
						+ " table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]");
		loginHelper.clickHelper(driver, "body > div > center > table > tbody > tr:nth-child(2) > td > div > "
				+ "center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)");
		loginHelper.signInHelper(driver, "username", reader.gettestData(3));
		loginHelper.signInHelper(driver, "password", reader.gettestData(4));
		loginHelper.clickHelper(driver,
				"body > table > tbody > tr > td.auto-style1 > form > div > "
						+ "center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > "
						+ "td:nth-child(2) > p > input[type=\"button\"]");
		loginCheck = loginHelper.loginCheck(driver);

		assertTrue(loginCheck);
		report.endTest(test);
		report.flush();
		driver.quit();
		// **Successful Login**
	}

}
