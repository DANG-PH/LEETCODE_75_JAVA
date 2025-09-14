import java.util.*;

// solution 2ms
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int tich = 1;
//        int[] ketQua = new int[nums.length];
//        int soLanXuatHienSo0 = 0;
//        for (int num : nums) {
//            tich *= num;
//            if (num == 0) soLanXuatHienSo0++;
//            if (soLanXuatHienSo0 >= 2) {
//                int[] list0 = new int[nums.length];
//                Arrays.fill(list0,0);
//                return list0;
//            }
//        }
//        if (soLanXuatHienSo0 == 0) {
//            for (int i = 0; i < nums.length; i++) {
//                ketQua[i] = tich/nums[i];
//            }
//        } else if (soLanXuatHienSo0 == 1) {
//            Arrays.fill(ketQua,0);
//            int tich1 = 1;
//            int index0 = -1;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] != 0) {
//                    tich1 *= nums[i];
//                } else {
//                    index0 = i;
//                }
//            }
//            ketQua[index0] = tich1;
//        }
//        return ketQua;
//    }
//}

// road to 1ms solution : prefix sum
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] res = new int[n];
//        res[0] = 1;
//        for (int i = 1; i < n; i++) {
//            res[i] = res[i-1]*nums[i-1];
//        }
//
//        int tichBenPhai = 1;
//        for (int i = n-1; i >= 0; i--) {
//            res[i] *= tichBenPhai;
//            tichBenPhai *= nums[i];
//        }
//        return res;
//    }
//}


//public class Product_of_Array_Except_Self_238 {
//}
