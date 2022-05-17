package retryFailedTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01 {
	
	@Test(retryAnalyzer = retryFailedTC.RetryAnalyzer01.class)
	public void test1() {
		Assert.assertEquals(true, false);
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}
}
