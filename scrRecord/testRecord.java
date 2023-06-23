package scrRecord;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import screen.ScreenRecorderUtil;

public class testRecord {

	public static void main(String[] args) throws Exception {

		ScreenRecorderUtil.startRecord("main");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"))
				.sendKeys("8319926927");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(4000);

		TakesScreenshot sc = ((TakesScreenshot) driver);

		File src = sc.getScreenshotAs(OutputType.FILE);

		File f2 = new File("C:\\Users\\Manish\\Pictures\\Screenshots\\aniket.png");

		FileUtils.copyFile(src, f2);
		ScreenRecorderUtil.stopRecord();
		driver.close();

	}

}
