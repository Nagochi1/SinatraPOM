package com.sinatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	public HomePage(WebDriver driver2) {
		this.driver = driver2;
	}
	
	//elements:
		WebElement sinatraImg; // xpath: //img[@src='/images/sinatra.jpg']
		WebElement welcomeLbl; // xpath: //p[contains(text(), 'Welcome')]
		WebElement navBar; // xpath: //


	//	methods:
		public void logIn(String user, String pwd) {
			driver.findElement(By.xpath("//a[@href='/login']")).click();
			driver.findElement(By.id("username")).sendKeys(user);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
						
			if (driver.findElement(By.xpath("//a[@href='/logout']")).isDisplayed())
				   System.out.println("Login exitoso");
				  else {
				   System.out.println("Login no exitoso");
				   System.exit(-1);
			}
		}
		
				
		public void logOut() {
			driver.findElement(By.xpath("//a[@href='/logout']")).click();
			
		}

}
