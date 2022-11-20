package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	static WebDriver driver;
	@Parameters("browser")
	@Test
	private void m1(String browser) {
if(browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("https://adactinhotelapp.com/");

}
WebElement txtuser = driver.findElement(By.id("username"));
txtuser.sendKeys("Shakeels");

WebElement txtpass = driver.findElement(By.id("password"));
txtpass.sendKeys("Ahmedsha006@");
WebElement btnlogin = driver.findElement(By.className("login_button"));
btnlogin.click();
	}
}
