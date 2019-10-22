package problems.problem28_ImplementStrStr;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void hello() {
		Solution s = new Solution();
		Assert.assertEquals(2, s.strStr("hello", "ll"));
	}
	
	@Test
	public void aaaa() {
		Solution s = new Solution();
		Assert.assertEquals(-1, s.strStr("aaaaa", "bba"));
	}
}
