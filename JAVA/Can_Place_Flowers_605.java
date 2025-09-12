//import java.util.*;
//
//class Solution {
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        if (n == 0) return true;
//        int len = flowerbed.length;
//        for (int i = 0; i < len; ) {
//            if (flowerbed[i] == 1) {
//                i += 2;
//            }
//            else if (flowerbed[i] == 0 &&
//                    (i == 0 || flowerbed[i - 1] == 0) &&
//                    (i == len - 1 || flowerbed[i + 1] == 0)) {
//
//                n--;
//                if (n <= 0) return true;
//                i += 2;
//            } else {
//                i++;
//            }
//        }
//        return false;
//    }
//}
//
//
//public class Can_Place_Flowers_605 {
//}
