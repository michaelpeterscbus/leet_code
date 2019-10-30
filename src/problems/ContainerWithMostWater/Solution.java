package problems.ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
    		int max = 0;
        for(int i = 0; i < height.length; i++) {
        		for(int j = height.length - 1; j > 0; j--) {
        			int minHeight = Math.min(height[i], height[j]);
        			int area = minHeight * (Math.abs(j - i));
        			if (max < area) {
        				max = area;
        			}
        		}
        }
        return max;
    }
}
