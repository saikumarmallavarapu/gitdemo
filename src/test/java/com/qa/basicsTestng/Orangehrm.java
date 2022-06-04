package com.qa.basicsTestng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Orangehrm {
	WebDriver driver;
public void BasicUrl() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");	
	}
@Test
public void LoginDetails() throws InterruptedException
{
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
}
 @Test
 public void MyInfo()
 {
	driver.findElement(By.xpath(  "//*[@id='menu_pim_viewMyDetails']/b")).click();
 }
 @Test
 public void VerifyLogin()
 {
	 WebElement element=driver.findElement(By.id("welcome"));
	 System.out.println(element.isDisplayed());
	 System.out.println(element.getText());
	 driver.quit();
 }
  }
