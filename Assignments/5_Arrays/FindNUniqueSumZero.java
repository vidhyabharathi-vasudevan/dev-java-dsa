//Find N Unique Integers Sum up to Zero
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
public class FindNUniqueSumZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for(int i=1;i<=n/2;i++){
            ans[index++] = i;
            ans[index++] = -i;
        }
        if(n%2!=0){
            ans[index] = 0;
        }
        return ans;

    }
}
