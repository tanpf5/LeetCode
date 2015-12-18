import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        int first = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1 || i == nums.length - 1) {
                if (first == i) {
                    ans.add(Integer.toString(nums[first]));
                } else {
                    ans.add(Integer.toString(nums[first]) + "->" + Integer.toString(nums[i - 1]));
                }
                first = i;
            }
        }
        return ans;
    }
}
