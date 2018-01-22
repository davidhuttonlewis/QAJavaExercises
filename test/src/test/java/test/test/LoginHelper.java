package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginHelper {

	public void signInHelper(WebDriver d, String value1, String value2) throws InterruptedException {
		WebElement searchBox = d.findElement(By.name(value1));
		searchBox.sendKeys(value2);
		Thread.sleep(2000);
	}

	public void clickHelper(WebDriver d, String value) throws InterruptedException {
		WebElement addUser = d.findElement(By.cssSelector(value));
		addUser.click();
		Thread.sleep(2000);
	}

	public boolean loginCheck(WebDriver d) {
		if (d.getPageSource().contains("**Successful Login**")) {
			return true;
		}
		return false;
	}

	public WebDriver settingBowser(WebDriver d, String val) {

		switch (val) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");
			d = new ChromeDriver();
			return d;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Dhutt/Desktop/QASlides/geckodriver-v0.19.1-win64/geckodriver.exe");
			d = new FirefoxDriver();
			return d;
		default:
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Dhutt/Desktop/QASlides/geckodriver-v0.19.1-win64/geckodriver.exe");
			d = new FirefoxDriver();
			return d;
		}
	}

	public void openWebBowser(WebDriver d, String val) throws InterruptedException {
		d.get(val);
		Thread.sleep(2000); // Let the user actually see something!
	}

}
