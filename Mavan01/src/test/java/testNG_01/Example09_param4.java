package testNG_01;

import org.testng.annotations.Test;

public class Example09_param4 {
	
	@Test(dependsOnMethods="signIn",enabled=true)
	public void login() {
		System.out.println("this is login method");
	}
	
	@Test(dependsOnMethods="login",enabled=true)
	public void sendmail() {
		System.out.println("this is send mail method");
	}
	
	@Test(enabled=true)
	public void signIn() {
		System.out.println("Tis is sign in method");
	}
	
	/*
	 * we can set order of @TEst to run as per requirement
	 * we ese dependsOnMethods="@Test Method name",enabled=true
	 */
}
