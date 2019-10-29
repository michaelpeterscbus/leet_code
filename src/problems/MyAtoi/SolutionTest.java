package problems.MyAtoi;

import org.junit.*;


public class SolutionTest {
	@Test
	public void test1() {
		Solution s = new Solution();
		String str = "42";
		Assert.assertEquals(42, s.myAtoi(str));
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		String str = "   -42";
		Assert.assertEquals(-42, s.myAtoi(str));
	}
	
	@Test
	public void test3() {
		Solution s = new Solution();
		String str = "4193 with words";
		Assert.assertEquals(4193, s.myAtoi(str));
	}
	
	@Test
	public void test4() {
		Solution s = new Solution();
		String str = "words and 987";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void testNegativeWord() {
		Solution s = new Solution();
		String str = "   -words 57";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void test6() {
		Solution s = new Solution();
		String str = "-91283472332";
		Assert.assertEquals(-2147483648, s.myAtoi(str));
	}
	
	@Test
	public void testEmptyString() {
		Solution s = new Solution();
		String str = "";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void testOneHyphen() {
		Solution s = new Solution();
		String str = "-";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void testPositiveSign() {
		Solution s = new Solution();
		String str = "+1";
		Assert.assertEquals(1, s.myAtoi(str));
	}
	
	@Test
	public void testPositiveSignAlone() {
		Solution s = new Solution();
		String str = "+";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void emptySpaces() {
		Solution s = new Solution();
		String str = " ";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void plusMinus() {
		Solution s = new Solution();
		String str = "+-2";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void test2tothe31() {
		Solution s = new Solution();
		String str = "2147483648";
		Assert.assertEquals(2147483647, s.myAtoi(str));
	}
	
	@Test
	public void testZero() {
		Solution s = new Solution();
		String str = "0-1";
		Assert.assertEquals(0, s.myAtoi(str));
	}
	
	@Test
	public void testNegativeZero() {
		Solution s = new Solution();
		String str = "  -0012a42";
		Assert.assertEquals(-12, s.myAtoi(str));
	}
}
