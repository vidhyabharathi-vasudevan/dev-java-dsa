//Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Pangram {
    public boolean checkIfPangram(String sentence) {
        boolean ans = true;
        for (int i = 0; i < 26; i++) {
            char x = (char) (97 + i);
            if (sentence.contains(x + "")) {
                continue;
            } else {
                return false;
            }
        }
        return ans;
    }
}
