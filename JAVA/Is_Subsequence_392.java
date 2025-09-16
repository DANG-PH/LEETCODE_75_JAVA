//import java.util.*;
//
//class Solution {
//    public boolean isSubsequence(String s, String t) {
//        int n = t.length();
//        int left = 0,right = 0;
//        StringBuilder sb = new StringBuilder();
//        while (right < n) {
//            while (right < n && s.contains(String.valueOf(t.charAt(right)))) right++;
//            sb.append(t, left, right-left);
//            while (right < n && !s.contains(String.valueOf(t.charAt(right)))) right++;
//            left = right;
//        }
//        if (sb.toString().contains(s)) return true;
//        return false;
//    }
//}
//
//public class Is_Subsequence_392 {
//}
