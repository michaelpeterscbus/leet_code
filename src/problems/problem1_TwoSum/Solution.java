package problems.problem1_TwoSum;

public class Solution {

	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int a = 0;
        int b = 0;
        for(int i=0; i<nums.length - 1;i++){
            for(int j =1; j<nums.length;j++){
                if ( i != j){
                 if(nums[i] + nums[j] == target){
                  a = i;
                  b = j;  
                 }
                }
        }
        }
        result[0] = a;
        result[1] = b;
        return result;
    }
}
