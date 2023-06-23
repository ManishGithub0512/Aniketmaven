package Navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommand {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dd = new ChromeDriver();
		dd.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		dd.navigate().refresh();
		dd.findElement(By.id("user-name")).sendKeys("manish");
		Thread.sleep(2000);
		dd.findElement(By.id("password")).sendKeys("yadav");
		Thread.sleep(2000);
		dd.navigate().forward();
		Thread.sleep(2000);
		dd.navigate().back();
		Thread.sleep(2000);
		dd.close();
	}
}
