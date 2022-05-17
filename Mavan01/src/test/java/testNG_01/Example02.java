package testNG_01;

import org.testng.annotations.Test;

public class Example02 {
	@Test
	public void tc1(){
		System.out.println("I am from tc1");
		
	}

	@Test
	public void tc02(){
		System.out.println("I am from tc2");
	}
}
//in testNg test cases run in alphabetical orders


/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/



