package test.test;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseExercises {

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dhutt/Desktop/QASlides/chromedriver_win32/chromedriver.exe");

	}

	@Test(priority = 1)
	public void dragableTest1() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");//
		WebDriver driver = new ChromeDriver(options);
		Actions builder = new Actions(driver);
		driver.get("http://demoqa.com");
		Thread.sleep(2000);

		builder.moveToElement(driver.findElement(By.id("menu-item-140"))).click().perform();
		Thread.sleep(2000); // Let the user actually see something!
		builder.dragAndDropBy(driver.findElement(By.id("draggable")), 15, 15).perform();
		Thread.sleep(2000); // Let the user actually see something!
	}

	@Test(priority = 2)
	public void testGoogleSearch() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");//
		WebDriver driver = new ChromeDriver(options);
		Actions builder = new Actions(driver);
		driver.get("http://demoqa.com");
		Thread.sleep(2000);

		builder.moveToElement(driver.findElement(By.id("menu-item-140"))).click().perform();
		Thread.sleep(2000); // Let the user actually see something!
		builder.dragAndDropBy(driver.findElement(By.id("draggable")), 15, 15).perform();
		Thread.sleep(2000); // Let the user actually see something!
		builder.moveToElement(driver.findElement(By.id("menu-item-141"))).click().perform();
		Thread.sleep(2000); // Let the user actually see something!
		builder.dragAndDrop(driver.findElement(By.id("draggableview")), driver.findElement(By.id("droppableview")))
				.perform();
		Thread.sleep(2000);
		builder.moveToElement(driver.findElement(By.id("menu-item-143"))).click().perform();
		Thread.sleep(2000); // Let the user actually see something!
		builder.dragAndDropBy(
				driver.findElement(By.cssSelector(
						"#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se")),
				50, 50).perform();
		builder.moveToElement(driver.findElement(By.id("menu-item-142"))).click().perform();
		Thread.sleep(2000); // Let the user actually see something
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"))).click().perform();
		Thread.sleep(5000);
		builder.moveToElement(driver.findElement(By.id("menu-item-144"))).click().perform();
		Thread.sleep(2000); // Let the user actually see something
		builder.moveToElement(driver.findElement(By.id("ui-id-6"))).click().perform();
		Thread.sleep(2000);
		builder.moveToElement(driver.findElement(By.id("menu-item-145"))).click().perform();

		builder.moveToElement(driver.findElement(By.id("tagss"))).click().perform();
		builder.sendKeys("J");

		List<WebElement> optionsToSelect = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
		String textToSelect = "Java";

		/*
		 * for(WebElement option : optionsToSelect){ System.out.println(option);
		 * if(option.getText().equals(textToSelect)) {
		 * System.out.println("Trying to select: "+textToSelect); option.click(); break;
		 */

		Thread.sleep(5000);
		driver.quit();
	}

}
