package com.sinatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewSongPage {
	
	private WebDriver driver;
	public AddNewSongPage(WebDriver driver2) {
		this.driver = driver2;
	}
	
	//elements:
	WebElement addNewSongLbl;// xpath: //h1[text() = 'Add A New Song']
	WebElement titleTxt; //id: title
	WebElement lengthTxt; //id: length
	WebElement dateTxt; //id: released_on
	WebElement lyricsTxt; // id: lyrics
	WebElement saveSongBtn; // xpath: //input[@value='Save Song']


	//methods:

	public void addNewSong(String songName, int length, String date, String lyrics) {
		driver.findElement(By.xpath("//a[@href='/songs']")).click();
		driver.findElement(By.xpath("//a[@href='/songs/new']")).click();
		driver.findElement(By.id("title")).sendKeys(songName);
		driver.findElement(By.id("length")).sendKeys(length + "");
		driver.findElement(By.id("released_on")).sendKeys(date);
		driver.findElement(By.id("lyrics")).sendKeys(lyrics);
		driver.findElement(By.xpath("//input[@value='Save Song']")).click();
		
	}
	
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
