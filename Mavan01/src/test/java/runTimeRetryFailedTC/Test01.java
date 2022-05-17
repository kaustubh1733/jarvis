package runTimeRetryFailedTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01 {
	@Test
	public void tc1() {
		Assert.assertEquals(true, false);
	}

	@Test
	public void tc2() {
		Assert.assertEquals(true, true);
	}
}
