package problems.problem7_ReverseInteger;

public class TestCase {
	public static void main(String[] args) {
		int x = 1534236469;
		int y = -123;
		int z = 120;
		
		System.out.println("Input: " + x);
		System.out.println("Output: " + Solution.reverse(x));
		
		System.out.println("Input: " + y);
		System.out.println("Output: " + Solution.reverse(y));
		
		System.out.println("Input: " + z);
		System.out.println("Output: " + Solution.reverse(z));
	}
}
