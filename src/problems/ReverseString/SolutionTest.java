package problems.ReverseString;

import org.junit.*;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		char[] input = {'h','e','l','l','o'};
		char[] answer = {'o','l','l','e','h'};
		Assert.assertArrayEquals(answer, s.reverseString(input));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		char[] input = {'h','a','n','n','a','h'};
		char[] answer = {'h','a','n','n','a','h'};
		Assert.assertArrayEquals(answer, s.reverseString(input));
	}
}
