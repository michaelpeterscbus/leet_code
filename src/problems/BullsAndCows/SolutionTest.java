package problems.BullsAndCows;

import org.junit.*;

public class SolutionTest {

		@Test
		public void test1() {
			Solution s = new Solution();
			String secret = "1807";
			String guess = "7810";
			Assert.assertEquals("1A3B", s.getHint(secret, guess));
		}
		
		@Test
		public void test2() {
			Solution s = new Solution();
			String secret = "1123";
			String guess =  "0111";
			Assert.assertEquals("1A1B", s.getHint(secret, guess));
		}
		
		@Test
		public void test3() {
			Solution s = new Solution();
			String secret = "011";
			String guess = "110";
			Assert.assertEquals("1A2B", s.getHint(secret, guess));
		}
		
		@Test
		public void test4() {
			Solution s = new Solution();
			String secret = "1122";
			String guess = "2211";
			Assert.assertEquals("0A4B", s.getHint(secret, guess));
		}
		
		@Test
		public void test5() {
			Solution s = new Solution();
			String secret = "1122";
			String guess = "1222";
			Assert.assertEquals("3A0B", s.getHint(secret, guess));
		}
}
