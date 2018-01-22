package test.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CookieClass {

	@Test(priority = 1)
	@Ignore
	public void test1() throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/cookie/selenium_aut.php");

		Thread.sleep(5000);

		// Input Email id and Password If you are already Register
		driver.findElement(By.name("username")).sendKeys("abc123");
		driver.findElement(By.name("password")).sendKeys("123xyz");
		driver.findElement(By.name("submit")).click();

		// create file named Cookies to store Login Information
		File file = new File("Cookies.data");
		try {
			// Delete old file if exists
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			// loop for getting the cookie information

			// loop for getting the cookie information
			for (Cookie ck : driver.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.close();
			fileWrite.close();
			driver.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test(priority = 2)
	@Ignore
	public void test2() throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		try {

			File file = new File("Cookies.data");
			FileReader fileReader = new FileReader(file);
			BufferedReader Buffreader = new BufferedReader(fileReader);
			String strline;
			while ((strline = Buffreader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				while (token.hasMoreTokens()) {
					String name = token.nextToken();
					String value = token.nextToken();
					String domain = token.nextToken();
					String path = token.nextToken();
					Date expiry = null;

					String val;
					if (!(val = token.nextToken()).equals("null")) {
						expiry = new Date(val);
					}
					Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
					System.out.println(ck);
					driver.manage().addCookie(ck); // This will add the stored cookie to your current session
				}
				Buffreader.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Thread.sleep(5000);
		driver.get("http://demo.guru99.com/selenium/cookie/selenium_aut.php");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

	@Test
	@Ignore
	public void testGoogleSearch() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");

		LoginHelper loginHelper = new LoginHelper();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tappedout.net/accounts/login/?next=/");
		Thread.sleep(2000); // Let the user actually see something!
		// Input Email id and Password If you are already Register
		driver.findElement(By.id("id_username")).sendKeys("");
		driver.findElement(By.id("id_password")).sendKeys("");
		driver.findElement(By.cssSelector(
				("#body > div.container.margin-top-18 > div > div:nth-child(1) > div > form > input.submit.btn.btn-default")))
				.click();

		Thread.sleep(5000); // Let the user actually see something!

		// create file named Cookies to store Login Information
		File file = new File("Cookies.data");
		try {
			// Delete old file if exists
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			// loop for getting the cookie information

			// loop for getting the cookie information
			for (Cookie ck : driver.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.close();
			fileWrite.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		driver.quit();
	}

	@Test

	public void test4() throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		try {

			File file = new File("Cookies.data");
			FileReader fileReader = new FileReader(file);
			BufferedReader Buffreader = new BufferedReader(fileReader);
			String strline;
			while ((strline = Buffreader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				while (token.hasMoreTokens()) {
					String name = token.nextToken();
					String value = token.nextToken();
					String domain = token.nextToken();
					String path = token.nextToken();
					Date expiry = null;

					String val;
					if (!(val = token.nextToken()).equals("null")) {
						expiry = new Date();
					}
					Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
					// System.out.println(ck);
					driver.manage().addCookie(ck); // This will add the stored cookie to your current session
				}
			}
			fileReader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		driver.get("https://tappedout.net/accounts/login/?next=/");
	}

}
