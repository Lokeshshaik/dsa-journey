import java.util.*;

public class LongestSubarrayWithSum {

    // Method to find the length of the longest subarray with sum equal to targetSum
    public static int findLongestSubarrayLength(int[] array, int targetSum) {
        int n = array.length; // size of the array

        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            currentSum += array[i]; // calculate the prefix sum till index i

            // If current sum equals target sum, update maxLength
            if (currentSum == targetSum) {
                maxLength = Math.max(maxLength, i + 1);
            }

            // Calculate the remaining sum i.e., currentSum - targetSum
            int remainingSum = currentSum - targetSum;

            // If the remaining sum exists in the map, calculate the subarray length
            if (prefixSumMap.containsKey(remainingSum)) {
                int subarrayLength = i - prefixSumMap.get(remainingSum);
                maxLength = Math.max(maxLength, subarrayLength);
            }

            // Update the map with the first occurrence of the current sum
            if (!prefixSumMap.containsKey(currentSum)) {
                prefixSumMap.put(currentSum, i);
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
