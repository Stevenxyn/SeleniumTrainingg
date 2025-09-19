package UI;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {

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

		
		String pageURL = "https://www.saucedemo.com/";
		
		driver.get(pageURL);
		
		//Identificacion de elementos uno a uno
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	
		//Identificacion de varios elementos - Debemos ajustar el Xpath para que identifique el bloque de elemntos
		List <WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println("Estos son los WebElemnents" + webElements);
		System.out.println(" ");

		
		//Obtencion de ciertos datos del navegador y pagina
		String currentURL = driver.getCurrentUrl();
		System.out.println("El url actual es: " + currentURL);
		
		String webTitle =driver.getTitle();
		System.out.println("El titulo actual es: " + webTitle);

		String sourcePage =driver.getPageSource();
		//System.out.println("me da todo el HTML de la pagina " + sourcePage);
		
		


	
	
	
	
	
	
	}

}
