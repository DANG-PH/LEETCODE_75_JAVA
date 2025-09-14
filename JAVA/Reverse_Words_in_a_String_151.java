import java.util.*;

// solution : 11-12ms
//class Solution {
//    public String reverseWords(String s) {
//        String[] mang = s.trim().split(" ");
//        String ketQua = "";
//        for (int i = mang.length - 1; i >= 0; i--) {
//            if (!mang[i].isEmpty()) {
//                String sau = (i == 0) ? "" : " ";
//                ketQua += mang[i] + sau;
//            }
//        }
//        return ketQua;
//    }
//}


// solution 2ms
//class Solution {
//    public String reverseWords(String s) {
//        char[] chuoi = s.trim().toCharArray();
//        int n = chuoi.length;
//        daoNguocChuoi(chuoi,0,n-1);
//
//        StringBuilder sb = new StringBuilder();
//        int start = 0, end = 0;
//        while (end < n) {
//            while (end < n && chuoi[end] != ' ') end++;
//            daoNguocChuoi(chuoi,start,end-1);
//            sb.append(chuoi, start, end-start).append(" ");
//            while (end < n && chuoi[end] == ' ') end++;
//            start = end;
//        }
//        return sb.toString().trim();
//    }
//
//    public void daoNguocChuoi(char[] chuoi, int start, int end) {
//        while (start < end) {
//            char tmp = chuoi[end];
//            chuoi[end] = chuoi[start];
//            chuoi[start] = tmp;
//            start++;
//            end--;
//        }
//    }
//}

//public class Reverse_Words_in_a_String_151 {
//}
