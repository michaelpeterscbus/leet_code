package problems.problem9_PalindromeNumber;

public class TestCase {
	public static void main(String[] args) {

		int x = 121;
		int y = -121;
		int z = 10;

		System.out.println("Input: " + x);
		System.out.println("Output: " + Solution.isPalindrome(x));
		
		System.out.println("Input: " + y);
		System.out.println("Output: " + Solution.isPalindrome(y));
		
		System.out.println("Input: " + z);
		System.out.println("Output: " + Solution.isPalindrome(z));
	}
}
