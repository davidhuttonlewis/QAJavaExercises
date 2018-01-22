package test.cookie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.TestCase;

public class QACookie extends TestCase {

	@Test
	public void test1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.amazon.co.uk");
		// driver.get("http://demo.guru99.com/selenium/cookie/selenium_aut.php");
		Actions builder = new Actions(driver);
		// Input Email id and Password If you are already Register
		// builder.moveToElement(driver.findElement(By.id("nav-link-yourAccount"))).click().perform();

		// driver.findElement(By.id("ap_email")).sendKeys("");
		// driver.findElement(By.id("ap_password")).sendKeys("");
		// driver.findElement(By.id("signInSubmit")).click();
		driver.get("https://tappedout.net/accounts/login/?next=/");
		Thread.sleep(2000); // Let the user actually see something!
		// Input Email id and Password If you are already Register
		driver.findElement(By.id("id_username")).sendKeys("");
		driver.findElement(By.id("id_password")).sendKeys("");
		driver.findElement(By.cssSelector(
				("#body > div.container.margin-top-18 > div > div:nth-child(1) > div > form > input.submit.btn.btn-default")))
				.click();

		Thread.sleep(5000); // Let the user actually see something!

		File f = new File("browser.data");

		f.delete();
		f.createNewFile();
		BufferedWriter bos = new BufferedWriter(new FileWriter(f));

		for (Cookie ck : driver.manage().getCookies()) {
			bos.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
					+ ck.getExpiry() + ";" + ck.isSecure()));
			bos.newLine();

		}
		bos.close();

	}

	@Test
	public void test2() throws IOException, ParseException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		File f = new File("browser.data");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;
		DateFormat fs = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy");
		// driver.get("https://www.amazon.co.uk");
		driver.get("http://tappedout.net");
		driver.get("http://mvnrepository.com/");

		while ((line = br.readLine()) != null) {
			StringTokenizer str = new StringTokenizer(line, ";");
			while (str.hasMoreTokens()) {

				String name = str.nextToken();
				String value = str.nextToken();
				String domain = str.nextToken();
				String path = str.nextToken();
				Date expiry = null;
				String dt;

				if (!(dt = str.nextToken()).equals("null")) {
					expiry = fs.parse(dt);
				}
				System.out.println(expiry);
				// System.out.println(dt);
				boolean isSecure = new Boolean(str.nextToken()).booleanValue();
				Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
				System.out.println(name);
				System.out.println(value);
				System.out.println(domain);
				System.out.println(path);
				System.out.println(expiry);
				System.out.println(isSecure);
				System.out.println(ck);
				driver.manage().addCookie(ck);
			}

		}
		driver.get("http://tappedout.net");
		// driver.get("https://www.amazon.co.uk");
		br.close();
	}
}
