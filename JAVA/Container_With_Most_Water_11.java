class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area;
            if (height[left] < height[right]) {
                area = height[left] * (right - left);
                if (area > max) max = area;
                left++;
            } else {
                area = height[right] * (right - left);
                if (area > max) max = area;
                right--;
            }
        }
        return max;
    }
}

public class Container_With_Most_Water_11 {
}
