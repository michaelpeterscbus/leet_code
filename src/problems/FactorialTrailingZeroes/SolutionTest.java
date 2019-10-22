package problems.FactorialTrailingZeroes;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		Assert.assertEquals(0,s.trailingZeroes(3));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		Assert.assertEquals(1,s.trailingZeroes(5));
	}
	
	@Test
	public void test3() {
		Solution s = new Solution();
		Assert.assertEquals(1,s.trailingZeroes(7));
	}
	
	@Test
	public void test4() {
		Solution s = new Solution();
		Assert.assertEquals(2,s.trailingZeroes(10));
	}
	
	@Test
	public void test5() {
		Solution s = new Solution();
		Assert.assertEquals(2,s.trailingZeroes(13));
	}
	
	@Test
	public void test6() {
		Solution s = new Solution();
		Assert.assertEquals(7,s.trailingZeroes(30));
	}
	
	@Test
	public void test7() {
		Solution s = new Solution();
		Assert.assertEquals(452137076,s.trailingZeroes(1808548329));
	}
}
