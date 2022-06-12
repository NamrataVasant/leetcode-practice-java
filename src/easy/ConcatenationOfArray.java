package easy;

public class ConcatenationOfArray {

    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }
        return result;
    }

    public static void main (String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println("Result: ");
        int[] answer = getConcatenation(nums);
        for (int ans : answer) {
            System.out.print(ans + ", ");
        }
    }
}
