import java.util.*;


////cach 1 : 6ms
//class Solution {
//    public int maxVowels(String s, int k) {
//        char[] chars = s.toCharArray();
//        int n = chars.length;
//        boolean[] isVowel = new boolean[128];
//        for (char c : "aeiou".toCharArray()) isVowel[c] = true;
//
//        int windowMAX = 0;
//        for (int i = 0; i < k; i++) {
//            if (isVowel[chars[i]]) windowMAX++;
//        }
//
//        int MAX = windowMAX;
//        for (int i = k; i < n; i++) {
//            if (isVowel[chars[i-k]]) windowMAX--;
//            if (isVowel[chars[i]]) windowMAX++;
//            if (windowMAX == k) return k;
//            MAX = Math.max(MAX,windowMAX);
//        }
//        return MAX;
//    }
//}

//// cach 2: 11ms
//class Solution {
//    public int maxVowels(String s, int k) {
//        int n = s.length();
//        int windowMAX = 0;
//
//        for (int i = 0; i < k; i++) {
//            if (isVowel(s.charAt(i))) windowMAX++;
//        }
//
//        int MAX = windowMAX;
//        for (int i = k; i < n; i++) {
//            if (isVowel(s.charAt(i - k))) windowMAX--;
//            if (isVowel(s.charAt(i))) windowMAX++;
//            if (windowMAX == k) return k;
//            if (windowMAX > MAX) MAX = windowMAX;
//        }
//        return MAX;
//    }
//
//    private boolean isVowel(char c) {
//        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
//    }
//}


public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length_1456 {
}
