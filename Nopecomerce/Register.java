package Nopecomerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		dri.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		dri.findElement(By.id("")).click();
		Thread.sleep(2000);
		dri.manage().window().maximize();
	}

}
