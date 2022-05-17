package testNG_01;

import org.testng.annotations.Test;

public class Example10_param5 {
	
	@Test(dependsOnMethods = "subtr", enabled = true)
	public void add() {
		int a, b = 10, c = 20;
		a = b + c;
		System.out.println("add is  =" + a);
	}

	@Test(dependsOnMethods = "div", enabled = true)
	public void subtr() {
		int a, b = 10, c = 20;
		a = b - c;
		System.out.println("subtr is  =" + a);

	}

	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
	public void div() {
		int a,b=10,c=20;
		a=b/0;
		System.out.println("div is  ="+a);
	}
		
	
	
		@Test(dependsOnMethods="signIn",enabled=true)
		public void login() {
			System.out.println("Hello, I am login from Example_Param1 class");
		}
		
		@Test(dependsOnMethods="login",enabled=true)
		public void checkNotification() {
			System.out.println("Hello, I am checkNotification from Example_Param1 class");
		}
		
		@Test(enabled=true,expectedExceptions=ArithmeticException.class)
		public void signIn() {
			System.out.println("Hello, I am signIn from Example_Param1 class");
			int i=10/0;
		}
	

}
