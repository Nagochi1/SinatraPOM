package com.sinatra.tests;

import org.junit.Test;

public class SinatraTestCasePOM extends SinatraBasePOM {
	
	String usuario="frank";
	String pwd="sinatra";
	String songName="Moon River";
	int length= 120;
	String date="05/28/2018";
	String lyrics="Moon river, wider than a mile I'm crossin' you in style some day Old dream maker, you heartbreaker";
	
	@Test
	public void logInTestCase()
	{
		home.logIn(usuario,pwd);
		
	}
	
	//@Test
	public void logOutTestCase() {
		home.logIn(usuario,pwd);
		home.logOut();
	}

	@Test
	public void SongsTestCase() {
		song.logIn(usuario,pwd);
		song.createSong();
		song.validateSongExists(songName);
		song.logOut();
	}
	
	//@Test
	public void AddSongTestCase() {
		addSong.logIn(usuario,pwd);
		addSong.addNewSong(songName, length, date, lyrics);
		addSong.logOut();
	}
	
}
