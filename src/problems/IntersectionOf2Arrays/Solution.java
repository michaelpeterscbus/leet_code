package problems.IntersectionOf2Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	 public int[] intersection(int[] nums1, int[] nums2) {
	        List<Integer> nums1List = new ArrayList<Integer>();
	        List<Integer> nums2List = new ArrayList<Integer>();
	        int largest = Math.max(nums1.length, nums2.length);
	        
	        for (int i = 0; i < largest; i++) {
	        	if(i < nums1.length && !nums1List.contains(nums1[i])) {
	        		nums1List.add(nums1[i]);
	        	}
	        	if(i < nums2.length && !nums2List.contains(nums2[i])) {
	        		nums2List.add(nums2[i]);
	        	}
	        }
	        List<Integer> intersectionList = new ArrayList<Integer>();
	        int largest2 = Math.max(nums1List.size(), nums2List.size());
	        for(int i = 0; i < largest2; i++) {
	        	if(i < nums1List.size() && !intersectionList.contains(nums1List.get(i)) && nums2List.contains(nums1List.get(i))) {
	        		intersectionList.add(nums1List.get(i));
	        	}
	        	if (i < nums2List.size() && !intersectionList.contains(nums2List.get(i)) && nums1List.contains(nums2List.get(i))) {
	        		intersectionList.add(nums2List.get(i));
	        	}
	        }
	        
	        int[] intersection = new int[intersectionList.size()];
	        for (int i = 0; i < intersection.length; i++) {
	        	intersection[i] = intersectionList.get(i);
	        }
	        return intersection;
	    }
}
