//import java.util.*;
//
//class Solution {
//    public int maxOperations(int[] nums, int k) {
//        Arrays.sort(nums);
//        int ketQua = 0;
//        int left = 0, right = nums.length-1;
//        while (left < right) {
//            int tong = nums[left] + nums[right];
//            if (tong < k) {
//                left++;
//            } else if (tong > k) {
//                right--;
//            } else {
//                left++;
//                right--;
//                ketQua++;
//            }
//        }
//        return ketQua;
//    }
//}
//
//public class Max_Number_of_K_Sum_Pairs_1679 {
//}
