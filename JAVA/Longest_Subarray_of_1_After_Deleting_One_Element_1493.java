import java.util.*;

class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left = 0, max = 0, cacSo0LienTiep = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) cacSo0LienTiep++;

            if (cacSo0LienTiep>1) {
                if (nums[left] == 0) cacSo0LienTiep--;
                left++;
            }

            max = Math.max(max, right - left +1);
        }
        return max-1;
    }
}

public class Longest_Subarray_of_1_After_Deleting_One_Element_1493 {
}
