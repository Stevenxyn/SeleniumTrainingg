package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class relativeLocators {

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
		
		String pageURL = "https://www.saucedemo.com/";

		driver.get(pageURL);
		driver.manage().window().maximize();

		
		//above - arriba
		WebElement fieldPassword = driver.findElement(By.id("password"));
		
		//Tener muy en cuenta el orden como se localiza el elemento
		// Video donde me guie - https://www.youtube.com/watch?v=4OCnnnniMWY
		WebElement fieldUsername2 = driver.findElement(with(By.tagName("input")).above(fieldPassword));
		
		fieldUsername2.sendKeys("Encontramos el elemento :)");
		
		driver.navigate().refresh();
		

        driver.quit();
		
	
	
	}

}
