package testNG_01;

import org.testng.annotations.Test;

public class Example01 {

	  @Test
	  public void testCase3() throws InterruptedException {
		  Thread.sleep(2000);
		  System.out.println("Hello, I am TC3 from example3 class");
	  }
	
	
}
