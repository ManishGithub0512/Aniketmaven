package FormFill;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import screen.ScreenRecorderUtil;

public class DataFilling {

	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("Datahandle");
		WebDriverManager.chromedriver().setup();
		WebDriver dd = new ChromeDriver();
		dd.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
		dd.findElement(By.name("FirstName")).sendKeys("Manish");
		Thread.sleep(2000);
		dd.findElement(By.id("Surname")).sendKeys("yadav");
		dd.findElement(By.name("E_post")).sendKeys("email");
		dd.findElement(By.id("Mobile")).sendKeys("8319926927");
		Thread.sleep(2000);
		dd.findElement(By.id("Username")).sendKeys("ManishKumar");

		Thread.sleep(2000);
		dd.findElement(By.id("Password")).sendKeys("Manish@333");
		dd.findElement(By.id("ConfirmPassword")).sendKeys("Manish@333");
		dd.findElement(By.id("submit")).click();
		Thread.sleep(5000);
		TakesScreenshot img = ((TakesScreenshot) dd);
		File Src = img.getScreenshotAs(OutputType.FILE);
		File F = new File("C:\\Users\\Manish\\Pictures\\Screenshots\\datahandling.png");
		FileUtils.copyFile(Src, F);
		ScreenRecorderUtil.stopRecord();
		dd.quit();
	}

}
