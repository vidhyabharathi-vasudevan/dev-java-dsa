//Create Target Array in the Given Order	
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import java.util.ArrayList;
import java.util.List;

public class TargetArrayInTheOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
