//import java.util.*;
//
//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> listKetQua = new ArrayList<>();
//        int Max = timMaxDay(candies);
//        for (int x : candies) {
//            listKetQua.add((x+extraCandies)>=Max);
//        }
//        return listKetQua;
//    }
//
//    public int timMaxDay(int[] day) {
//        int Max = day[0];
//        for (int i = 1; i < day.length; i++) {
//            if (day[i] > Max) {
//                Max = day[i];
//            }
//        }
//        return Max;
//    }
//}
//
//public class Kids_With_the_Greatest_Number_of_Candies_1431 {
//}
