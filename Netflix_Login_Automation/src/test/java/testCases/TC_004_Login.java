package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basePackage.DriverSetup;

public class TC_004_Login extends DriverSetup{

	public static String baseUrl="https://www.netflix.com/bd/login";
	@Test
	public static void locateElement() throws InterruptedException
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("sornaMovie@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_password")).sendKeys("$Poph89*");
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn-submit")).click();
		Thread.sleep(4000);
		
	}
}
