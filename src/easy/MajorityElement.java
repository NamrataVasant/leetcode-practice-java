package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maximumCount = 0;
        int maximumValue = Integer.MIN_VALUE;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maximumCount) {
                maximumCount = entry.getValue();
                maximumValue = entry.getKey();
            }
        }

        return maximumValue;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}