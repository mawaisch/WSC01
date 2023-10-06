package readData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_LoginActitime_Test {

	@Test
	public void login () throws InterruptedException {		
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.get(cred[0]);
		//driver.findElement(By.id("username")).sendKeys(cred[1]);
		//driver.findElement(By.name("pwd")).sendKeys(cred[2]);
		Thread.sleep(1000);
		//driver.findElement(By.id("loginButton")).click();
		driver.close();
	}

}

