package problems.AddDigits;

import org.junit.*;

public class SolutionTest {

	@Test
	public void test1() {
		Solution s = new Solution();
		Assert.assertEquals(2, s.addDigits(38));
	}
}
