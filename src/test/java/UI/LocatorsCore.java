package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsCore {

	public static String browser = "chrome"; // Podemos configurarlo externamente XLS, TXT CSV etc..
	public static WebDriver driver; 

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//https://www.saucedemo.com/
		//https://www.selenium.dev/documentation/webdriver/elements/locators/
		
		String pageURL = "https://www.selenium.dev/documentation/webdriver/elements/locators/";

		driver.get(pageURL);
		driver.manage().window().maximize();

		//driver.findElement(By.id("user-name")).sendKeys("Practice Locator by ID");
		//driver.findElement(By.className("form_input")).sendKeys("Practice locator by className");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("Practice Locator cssSelector");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Practice Locator by Xpath");
		//driver.findElement(By.tagName("input")).sendKeys("Practice Locator by tagName");
		
		//driver.findElement(By.linkText("Downloads")).click();
		//driver.findElement(By.partialLinkText("Started")).click();
		
	}

}
