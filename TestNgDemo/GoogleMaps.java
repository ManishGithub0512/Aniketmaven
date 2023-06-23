package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleMaps {
	public static void main(String[] args) throws Exception {
//		ScreenRecorderUtil.startRecord("main");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.id("APjFqb"));
		ele.sendKeys("Google Maps ");
		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys("botenical garden metro station");
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div[1]/button/span"))
				.click();
		Thread.sleep(3000);

		WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"sb_ifc50\"]/input"));
		ele3.clear();
		ele3.sendKeys("Cetpa Infotech Pvt. Ltd ");
		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body")).click();

		Thread.sleep(4000);
		driver.close();
//		ScreenRecorderUtil.stopRecord();
	}

}
