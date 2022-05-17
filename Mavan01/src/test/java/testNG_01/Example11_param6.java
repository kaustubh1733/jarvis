package testNG_01;

import org.testng.annotations.Test;

public class Example11_param6 {

	@Test(dependsOnMethods="signIn")
	public void login() {
		System.out.println("I AM FROM LOGIN METHOD");
	}
	
	@Test(dependsOnMethods="login",timeOut=2000)
	public void checkNotification() {
		System.out.println("I AM FROM NOTIFICATION METHOD");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
	public void signIn() {
		System.out.println("I AM FROM SIGN IN METHOD");
		int i = 452/0;
	}
	
}
