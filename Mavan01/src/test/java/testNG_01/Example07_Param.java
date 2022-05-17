package testNG_01;

import org.testng.annotations.Test;

public class Example07_Param {
	@Test(invocationCount = 5)
	public void param1() {
		System.out.println("this is method of incocationCount");
		System.out.println("incocationCount will run the method no. of times as requird");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
	}
/*
 * if testing class contains more than one method then all test methd will run alphabeical orders 
 */
}
