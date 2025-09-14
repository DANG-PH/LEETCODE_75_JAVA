//class Solution {
//    public String reverseVowels(String s) {
//        char[] chars = s.toCharArray();
//        boolean[] isVowel = new boolean[128];
//        for (char c : "aeiouAEIOU".toCharArray()) isVowel[c] = true;
//
//        int left = 0, right = chars.length - 1;
//
//        while (left < right) {
//            if (!isVowel[chars[left]]) {
//                left++;
//            } else if (!isVowel[chars[right]]) {
//                right--;
//            } else {
//                char tmp = chars[left];
//                chars[left] = chars[right];
//                chars[right] = tmp;
//                left++;
//                right--;
//            }
//        }
//
//        return new String(chars);
//    }
//}