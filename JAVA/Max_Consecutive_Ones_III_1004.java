import java.util.*;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, cacSo0LienTiep = 0, max = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) cacSo0LienTiep++;

            if (cacSo0LienTiep > k) {
                if (nums[left] == 0) cacSo0LienTiep--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}

public class Max_Consecutive_Ones_III_1004 {
}
