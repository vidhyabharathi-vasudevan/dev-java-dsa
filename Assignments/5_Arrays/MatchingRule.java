//Count Items Matching a Rule	
// https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.List;
public class MatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int type = 0;
        if (ruleKey.equals("type")) {
            type = 0;
        } else if (ruleKey.equals("color")) {
            type = 1;
        } else if (ruleKey.equals("name")) {
            type = 2;
        }
        int ans = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(type).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
