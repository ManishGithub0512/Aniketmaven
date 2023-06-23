package SwitchToAnotherWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		dri.get("http://omayo.blogspot.com/");
		// by this command we go to inside the frame ;
		dri.switchTo().frame("iframe2");
		dri.findElement(By.linkText("chapter3")).click();
		Thread.sleep(3000);
		dri.close();
	}
}