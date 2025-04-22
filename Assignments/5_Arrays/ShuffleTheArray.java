//Shuffle the Array	
//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i=0;i<n;i++){
            ans[index] = nums[i];
            ans[index+1] = nums[i+n];
            index = index + 2;
        }
        return ans;
    }
}
