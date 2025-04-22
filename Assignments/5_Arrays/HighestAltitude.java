// Find the Highest Altitude	
//https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];
        int count = 0;
        ans[0] = count;
        for (int i = 0; i < gain.length; i++) {
            count = count + gain[i];
            ans[i + 1] = count;
        }
        int max = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > max) {
                max = ans[i];
            }
        }
        return max;
    }
}
