package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exampleMavenDependencies {

	public static String browser = "edge"; // Podemos configurarlo externamente XLS, TXT CSV etc..
	public static WebDriver driver; 

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) { //Por alguna razon con Edge no ejecuta la el driver
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		


		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		String elementXpath = "//*[@id=\"center\"]/yt-searchbox/div[1]/form/input";
		driver.findElement(By.xpath(elementXpath)).sendKeys("Cry Cigarettes after sex");

		String searchBtn = "//*[@id=\"center\"]/yt-searchbox/button";
		driver.findElement(By.xpath(searchBtn)).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String playBtn = "//*[@id=\"call-to-action-button\"]/ytd-call-to-action-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div[2]";
		driver.findElement(By.xpath(playBtn)).click();

	}

}
