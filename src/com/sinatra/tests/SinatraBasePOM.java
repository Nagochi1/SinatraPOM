package com.sinatra.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sinatra.pages.HomePage;
import com.sinatra.pages.SongsPage;
import com.sinatra.pages.AddNewSongPage;


public class SinatraBasePOM { 
	
	private static WebDriver driver;
	protected HomePage home;
	protected SongsPage song;
	protected AddNewSongPage addSong;
	
	
			
	private static final String driverName = "webdriver.chrome.driver";
	private static final String driverPath = "C:\\test_automation\\drivers\\chromedriver.exe";
	
	@Before
	public void setup() {
		System.setProperty(driverName, driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http://songs-by-sinatra.herokuapp.com/");	
		home = new HomePage(driver);
		song = new SongsPage(driver);
		addSong = new AddNewSongPage(driver);
		
				
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
