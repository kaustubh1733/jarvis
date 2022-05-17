package testNgAdvXML;

import org.testng.annotations.Test;

public class GroupExamples {

	@Test(groups = "Regression")
	public void testOne() {
		System.out.println("I am test case one - in regression group");
	}
	
	@Test(groups = "Smoke Test")
	public void testTwo() {
		System.out.println("I am test case two = in smoke Test group");
	}
	
	@Test(groups = "Regression")
	public void testThree() {
		System.out.println("I Am test case three = in regression group");
	}
	
	@Test(groups = "Regression")
	public void testFour() {
		System.out.println("I am test case four - in regression group");
	}
	
	
	@Test(groups = "Smoke Test")
	public void testFive() {
		System.out.println("I am test case five - in Smoke TEst group");
	}
	
	
	
}
