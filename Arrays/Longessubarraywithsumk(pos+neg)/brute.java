import java.util.*;

public class LongestSubarrayWithGivenSumBruteForce {

    // Brute force method to get the length of longest subarray with sum equal to k
    public static int findLongestSubarrayLength(int[] array, int targetSum) {
        int n = array.length;
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int currentSum = 0;
                for (int i = start; i <= end; i++) {
                    currentSum += array[i];
                }

                if (currentSum == targetSum) {
                    maxLength = Math.max(maxLength, end - start + 1);
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
