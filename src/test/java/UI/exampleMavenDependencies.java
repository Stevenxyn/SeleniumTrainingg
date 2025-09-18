package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class exampleMavenDependencies {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
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
