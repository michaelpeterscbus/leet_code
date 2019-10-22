package problems.LengthOfLastWord;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	
	@Test
	public void hello() {
		Solution s = new Solution();
		Assert.assertEquals(5, s.lengthOfLastWord("Hello world"));
	}
	
	@Test
	public void space() {
		Solution s = new Solution();
		Assert.assertEquals(0, s.lengthOfLastWord(" "));
	}
}
