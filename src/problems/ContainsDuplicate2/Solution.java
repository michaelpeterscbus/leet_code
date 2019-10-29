package problems.ContainsDuplicate2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++){
			if(numsMap.containsKey(nums[i]) && i - numsMap.get(nums[i]) <= k){
				return true;
			}
			numsMap.put(nums[i], i);
		}
		return false;
//        int i = 0;
//        if (k >= nums.length) {
//        	Set<Integer> set = new HashSet<Integer>();
//        	for (int j = 0; j < nums.length; j++) {
//        		if(!set.add(nums[j])) {
//        			return true;
//        		}
//        	}
//        }
//        while (i + k <= nums.length ) {
//        	Set<Integer> set = new HashSet<Integer>();
//        	for(int j = i; j <= i + k; j++){
//        		if (i + k != nums.length && !set.add(nums[j])) {
//        			return true;
//        		}
//            }
//        	i++;
//        }
//      return false;
    }
}
