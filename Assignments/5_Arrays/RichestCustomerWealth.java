// https://leetcode.com/problems/richest-customer-wealth/description/
// Richest Customer Wealth
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int row = 0; row < accounts.length; row++) {
            int colMax = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                colMax = colMax + accounts[row][col];
            }
            if (colMax > max) {
                max = colMax;
            }
        }
        return max;
    }
}
