//import java.util.*;
//class Solution {
//    public static String gcdOfStrings(String str1, String str2) {
//        if ((str1+str2).equals(str2+str1)) {
//            return str1.substring(0,gcd(str1.length(),str2.length()));
//        }
//        return "";
//    }
//
//    public static int gcd(int a, int b) {
//        while (b > 0) {
//            int tmp = b;
//            b = a % b;
//            a = tmp;
//        }
//        return a;
//    }
//}
//
//public class Greatest_Common_Divisor_of_Strings_1071 {
//    public static void main(String[] args) {
//        System.out.println(Solution.gcdOfStrings("AABAABAAB","AABAAB"));
//    }
//}
//// Day 2 : Leetcode