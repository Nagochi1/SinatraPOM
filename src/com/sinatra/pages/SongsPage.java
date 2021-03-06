package com.sinatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SongsPage {
	
	private WebDriver driver;
	public SongsPage(WebDriver driver2) {
		this.driver = driver2;
	}
	
	//elements:
		WebElement songsLbl; // xpath: //h1[text() = 'Songs']
		WebElement songList; // id: songs
		WebElement createSongLnk; //linkText: Create a new song

		//methods:
		
		public void validateSongExists(String songName) {
			WebElement tituloCancionLnk = driver.findElement(By.xpath("//a[text()='"+songName+"']"));
			if(tituloCancionLnk.isDisplayed()) {
				System.out.println("La canci�n "+ tituloCancionLnk.getText() +" existe");
			}else {
				System.out.println("La canci�n "+ tituloCancionLnk.getText() +" no existe");
				
			}
			
		}
		
		public void createSong() {
			driver.findElement(By.xpath("//a[@href='/songs']")).click();
						
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
