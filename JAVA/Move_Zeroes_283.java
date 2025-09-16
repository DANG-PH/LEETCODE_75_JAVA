//import java.util.*;
//
//class Solution {
//    public void moveZeroes(int[] nums) {
//        if (nums.length == 1 || nums.length == 0) return;
//        int n = nums.length;
//        int cacSoKhac0 = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] != 0) {
//                nums[cacSoKhac0++] = nums[i];
//            }
//        }
//        while (cacSoKhac0 < n) {
//            nums[cacSoKhac0++] = 0;
//        }
//    }
//}
//
//public class Move_Zeroes_283 {
//}
