//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//Find Numbers with Even Number of Digits	
public class NumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        String s = "";
        int d = 0;
        int last = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEventDigit(nums[i], last, c)) {
                count++;
            }
        }
        return count;
    }

    public boolean isEventDigit(int n, int last, int c) {
        if (n < 0) {
            n = -n;
        }
        while (n > 0) {
            last = n % 10;
            c++;
            n = n / 10;
        }
        if (c % 2 == 0) {
            return true;
        }
        return false;
    }
}
