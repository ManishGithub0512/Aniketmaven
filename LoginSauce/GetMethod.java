package LoginSauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-- remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.close();
	}

}
