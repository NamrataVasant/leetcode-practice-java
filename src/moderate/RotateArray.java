package moderate;

public class RotateArray {
    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(k + i) % n] = nums[i];
        }

        System.arraycopy(result, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.print(nums[nums.length - 1] + "]");
    }
}
