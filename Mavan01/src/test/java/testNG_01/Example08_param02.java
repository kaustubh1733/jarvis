package testNG_01;

import org.testng.annotations.Test;

public class Example08_param02 {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("I am from log in method");
		
	}
	
	
	
	
	@Test(priority = 2)
	public void sendMail() {
		System.out.println("I am from send Mail method");
		
	}
	
	
	@Test(priority = 3)
	public void logOut() {
		System.out.println("I am from log out method");
		
	}

	/**

	By Default each @Test has priority as 0
	lowest priority will get executed first
	*/
	
	
}
