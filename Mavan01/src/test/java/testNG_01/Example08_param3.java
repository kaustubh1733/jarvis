package testNG_01;

import org.testng.annotations.Test;

public class Example08_param3 {
	
	@Test(enabled=true)
	public void param1() {
		System.out.println("This method 1 is available for execution");
	}
	
	@Test(enabled=false)
	public void param2() {
		System.out.println("This method 2 is not available for execution jvm will not run it");
	}
	
	
	@Test(enabled=true)
	public void param3() {
		System.out.println("This method is 3 available for execution");
	}

}
/*
**By default each @Test enabled will set as enabled = True
*enabled = true----> consider for execution
*enabled = false----> don't consider for execution
*/