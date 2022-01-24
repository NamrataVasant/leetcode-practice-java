package easy;

import java.util.Arrays;

public class HeightChecker {

    private static int heightChecker(int[] heights) {
        int mismatchCount = 0;
        int[] expectedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expectedHeights);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expectedHeights[i]) {
                mismatchCount++;
            }
        }

        return mismatchCount;
    }

    public static void main (String[] args) {
        int[] nums = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(nums));
    }
}
