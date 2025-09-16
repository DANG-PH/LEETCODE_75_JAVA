//import java.util.*;
//
//class Solution {
//    public int compress(char[] chars) {
//        int n = chars.length;
//        int write = 0;  // vị trí ghi tiếp theo trong chars
//        int left = 0, right = 0;
//        while (right < n) {
//            while (right < n && chars[right] == chars[left]) right++;
//            chars[write++] = chars[right-1];
//            int count = right - left;
//            if (count > 1) {
//                String cntStr = Integer.toString(count);
//                for (int i = 0; i < cntStr.length(); i++) {
//                    chars[write++] = cntStr.charAt(i);
//                }
//            }
//            left = right;
//        }
//        return write;
//    }
//}
//
//public class String_Compression_443 {
//}
