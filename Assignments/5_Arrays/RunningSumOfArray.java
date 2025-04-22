//Running Sum of 1d Array	
// https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
