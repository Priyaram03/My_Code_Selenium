package org.qt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.navigate().to("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
driver.manage().window().maximize();  

driver.findElement(By.id("username")).sendKeys("priyadharshinikarthikeyan47@gmail.com");
//driver.findElement(By.name("session_key")).sendKeys("priyadharshinikarthikeyan47@gmail.com");
//driver.findElement(By.cssSelector("#username")).sendKeys("priyadharshinikarthikeyan47@gmail.com");
//driver.findElement(By.className("Email or Phone")).sendKeys("priyadharshinikarthikeyan47@gmail.com");


driver.findElement(By.id("password")).sendKeys("PRIYARAM2004#");
//driver.findElement(By.name("session_password")).sendKeys("PRIYARAM2004#");
//driver.findElement(By.cssSelector("#password")).sendKeys("PRIYARAM2004#");
//driver.findElement(By.className("Password")).sendKeys("PRIYARAM2004#");


WebElement login = driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button"));
login.click();

//driver.findElement(By.linkText("Forgot password?")).click();
//driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
