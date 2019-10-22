package problems.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (numberMap.containsKey(nums[i])) {
				numberMap.put(nums[i], numberMap.get(nums[i]) + 1);
			} else {
				numberMap.put(nums[i], 1);
			}
		}
		int max = 0;
		int maxKey = 0;
		for (Integer key : numberMap.keySet()) {
			if (numberMap.get(key) > max) {
				max = numberMap.get(key);
				maxKey = key;
			}
		}
		return maxKey;
	}
}
