package easy;

import java.util.Arrays;

public class TwoSumII {

    private static int[] twoSumTwoPointers(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target)
                return new int[]{left + 1, right + 1};
            if (currentSum > target)
                right--;
            else
                left++;
        }

        return new int[]{-1, -1};
    }

    private static int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Brute force: " + Arrays.toString(twoSumBruteForce(nums, target)));
        System.out.println("Two pointers: " + Arrays.toString(twoSumTwoPointers(nums, target)));
    }
}
