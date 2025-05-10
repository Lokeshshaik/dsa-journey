import java.util.*;

public class LongestSubarrayWithSum {

    // Method to find the length of the longest subarray with sum equal to targetSum
    public static int findLongestSubarrayLength(int[] array, int targetSum) {
        int n = array.length;
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            int currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum += array[end]; // accumulate sum from start to end

                if (currentSum == targetSum) {
                    maxLength = Math.max(maxLength, end - start + 1); // update max length
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = { -1, 1, 1 };
        int targetSum = 1;
        int result = findLongestSubarrayLength(array, targetSum);

        System.out.println("The length of the longest subarray is: " + result);
    }
}
