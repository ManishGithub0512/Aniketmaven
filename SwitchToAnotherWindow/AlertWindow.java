package SwitchToAnotherWindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dd = new ChromeDriver();
		dd.manage().window().maximize();
		dd.get("http://omayo.blogspot.com/");
		dd.findElement(By.id("alert1")).click();
		Alert a1 = dd.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(2000);
		dd.switchTo().alert().accept();
		Thread.sleep(5000);

	}
}
