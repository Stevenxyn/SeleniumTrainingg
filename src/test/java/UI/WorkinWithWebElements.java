package UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkinWithWebElements {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//https://www.saucedemo.com/
		//https://www.selenium.dev/documentation/webdriver/elements/locators/
		
		String pageURL = "https://www.sugarcrm.com/es/request-demo/";

		driver.get(pageURL);
		
		//Encontrar el elemento y mandarle texto
		driver.findElement(By.id("input_1_3_3")).sendKeys("Mercy");
		//Encontrar el elemento y eliminarle el texto
		driver.findElement(By.id("input_1_3_3")).clear();
		//Obtener cierto atributo que enviemos del html
		String getAtributeTest = driver.findElement(By.id("input_1_3_3")).getDomAttribute("placeholder");
		System.out.println("El valor del atributo es: " + getAtributeTest);
	
	
		//Obtener el valor de una propiedad CSS
		String elemntoWeb1 = "//*[@id=\"gform_submit_button_1\"]";
		String valorProiedadCSS = driver.findElement(By.xpath(elemntoWeb1)).getCssValue("font-family");
		System.out.println("Valor de la propiedad CSS: " + valorProiedadCSS);
		
		//Obtener el tamaño del boton, localizacion del boton y su texto
		System.out.println("Tamaño boton: " + driver.findElement(By.xpath(elemntoWeb1)).getSize());
		System.out.println("Localizacion boton: " + driver.findElement(By.xpath(elemntoWeb1)).getLocation());
		System.out.println("Texto del boton: " + driver.findElement(By.xpath("//*[@id=\"field_1_87\"]")).getText());
		
		//Obtener nombre de la etiqueta
		System.out.println("Nombre de la etiqueta: " + driver.findElement(By.xpath(elemntoWeb1)).getTagName());
		
		//Obtener si esta o no visible
		System.out.println("Es visible o no el boton: " + driver.findElement(By.xpath(elemntoWeb1)).isDisplayed());
		
		//Obtener si esta habilitado o seleccionado
		System.out.println("Esta habilitado?: " + driver.findElement(By.xpath(elemntoWeb1)).isEnabled());
		System.out.println("Esta seleccionado?: " + driver.findElement(By.xpath(elemntoWeb1)).isSelected());
		
		
		
	}

}
