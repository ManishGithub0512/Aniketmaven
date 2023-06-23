package jalaAccedmy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.get("https://magnus.jalatechnologies.com/");
		Thread.sleep(2000);
		dr.manage().window().maximize();
		dr.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		Thread.sleep(2000);
		dr.findElement(By.id("Password")).sendKeys("jobprogram");
		Thread.sleep(2000);
		dr.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("FirstName")).sendKeys("Manish");
		Thread.sleep(2000);
		dr.findElement(By.id("LastName")).sendKeys("kumar");
		Thread.sleep(2000);
		dr.findElement(By.id("EmailId")).sendKeys("manishinfo0512@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.id("MobileNo")).sendKeys("8319926927");
		Thread.sleep(2000);
		dr.findElement(By.id("DOB")).sendKeys("02/08/1996");
		Thread.sleep(2000);
		dr.findElement(By.id("rdbMale")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("Address")).sendKeys("pipardih,33 P.O+P.S+DIST-Aurangababd");
		Thread.sleep(2000);

		Select drpcountry = new Select(dr.findElement(By.id("CountryId")));
		drpcountry.selectByValue("1");
		Thread.sleep(2000);
		dr.findElement(By.id("chkOtherCity")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("divOtherCity")).sendKeys("Bihar");
		Thread.sleep(2000);
		dr.findElement(By.id("chkSkill_1")).click();
		Thread.sleep(2000);
		dr.findElement(By.className("btn btn-success m-r-xs")).click();
		Thread.sleep(2000);
		dr.close();

	}

}
