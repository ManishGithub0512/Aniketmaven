package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import screen.ScreenRecorderUtil;

public class LoginDemo {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {
		ScreenRecorderUtil.startRecord("manish");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void VerifyTitle() throws InterruptedException {
		Thread.sleep(2000);
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("correct tittle");
		} else {
			System.out.println("Incorrest tittle");
		}
	}

	@Test(priority = 3)
	public void VerifyUrl() throws InterruptedException {
		Thread.sleep(2000);
		String ExpectedUrl = "https://www.saucedemo.com/";
		String ActualUrl = driver.getCurrentUrl();
		if (ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Correct Url");
		} else {
			System.out.println("Incorrect Url");
		}
	}

	@Test(priority = 2)
	public void VerifyLogin() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(ById.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}

	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(2000);
		ScreenRecorderUtil.stopRecord();
		driver.close();
	}

}
