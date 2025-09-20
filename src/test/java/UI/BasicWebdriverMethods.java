package UI;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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

		Actions actions = new Actions(driver);

		String pageURL = "https://www.saucedemo.com/";
		String windowHandle1 = driver.getWindowHandle();
		System.out.println("identificador ventana de saucedemo: " + windowHandle1);

		driver.get(pageURL);

		// Identificacion de elementos uno a uno
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// Identificacion de varios elementos - Debemos ajustar el Xpath para que
		// identifique el bloque de elemntos
		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println("Estos son los WebElemnents" + webElements);
		System.out.println(" ");

		// Con esto navegamos en la misma ventana a lo que le enviemos
		driver.navigate().to("https://kredicash.krediya.com.pa/");
		// Con esto sacamos el identificador de la ventana para navegar o retomarla
		// despues
		String windowHandle = driver.getWindowHandle();
		System.out.println("identificador ventana de kredicash: " + windowHandle);

		// driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_widget_1752864685105\"]")).click();
		WebElement element = driver.findElement(By.partialLinkText("Solicítalo"));
		actions.moveToElement(element).click().perform();
		Set<String> windowHandle_Kredicash = driver.getWindowHandles(); // Esto me retorna los ID de las ventanas 
		System.out.println("Id Firts window: " + windowHandle1);
		System.out.println("Id Second window: " + windowHandle_Kredicash); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().window("0F65F101067C572F2E764051A0EA6FC0");

		// Obtencion de ciertos datos del navegador y pagina
		String currentURL = driver.getCurrentUrl();
		System.out.println("El url actual es: " + currentURL);

		String webTitle = driver.getTitle();
		System.out.println("El titulo actual es: " + webTitle);

		String sourcePage = driver.getPageSource();
		// System.out.println("me da todo el HTML de la pagina " + sourcePage);

		
		driver.quit();
	}

}
