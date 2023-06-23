package Clear.Userdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearData {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dd = new ChromeDriver();
		dd.get("https://www.saucedemo.com/");
		dd.findElement(By.id("user-name")).sendKeys("manish");
		Thread.sleep(5000);
		dd.findElement(By.id("password")).sendKeys("yadav");
		Thread.sleep(5000);
		dd.findElement(By.id("user-name")).clear();
		dd.findElement(By.id("password")).clear();
		Thread.sleep(5000);
		dd.close();
	}
}
