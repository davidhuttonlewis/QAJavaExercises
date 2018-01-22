import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {

	@Test(priority = 1)
	public void selectCuntry() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		Actions builder = new Actions(driver);
		driver.get("http://demoqa.com");
		builder.moveToElement(driver.findElement(By.id("menu-item-374"))).click().perform();
		Select dropdown = new Select(driver.findElement(By.id("dropdown_7")));
		dropdown.selectByVisibleText("United Kingdom");
		Thread.sleep(5000);
		driver.close();
	}
}
