package problems.problem14_LongestCommonPrefix;

public class TestCase {
	public static void main(String[] args) {
		String[] strs = { "flower","flow","flight" };
		String[] strs2 = {"dog","racecar","car"};
		System.out.println("output 1: " + Solution.longestCommonPrefix(strs));
		System.out.println("output 2: " + Solution.longestCommonPrefix(strs2));
	}
}
