package LocatingForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKey {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dd = new ChromeDriver();
		dd.get("https://itera-qa.azurewebsites.net/home/automation");
		dd.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a")).click();
		Thread.sleep(5000);
		dd.close();

	}

}
