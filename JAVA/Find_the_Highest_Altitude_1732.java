import java.util.*;


class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] x = new int[n+1];
        int max = 0;
        for (int i = 1; i < n+1; i++) {
            x[i] = x[i-1]+gain[i-1];
            max = Math.max(max,x[i]);
        }
        return max;
    }
}

public class Find_the_Highest_Altitude_1732 {
}
