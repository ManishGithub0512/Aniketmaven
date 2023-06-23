import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jalaAcademey {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		dri.get("https://magnus.jalatechnologies.com/");
		Thread.sleep(2000);
		dri.manage().window().maximize();
		dri.close();
	}

}
