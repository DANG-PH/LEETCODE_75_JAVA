//class Solution1 {
//    public int pivotIndex(int[] nums) {
//        int n = nums.length;
//        if (n == 1) return 0;
//        int[] mang = new int[n];
//        mang[0] = nums[0];
//        for (int i = 1; i < n; i++) {
//            mang[i] = mang[i-1] + nums[i];
//        }
//        for (int i = 0; i < n; i++) {
//            if (i != 0 && mang[i-1] == mang[n-1]-mang[i]) {
//                return i;
//            } else if (i == 0 && mang[n-1]-nums[i] == 0) {
//                return 0;
//            }
//        }
//        return -1;
//    }
//}
//
