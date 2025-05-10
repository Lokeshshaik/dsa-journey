public class MaximumSubarraySum {

    // Brute force approach to find maximum subarray sum
    public int findMaximumSubarraySum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        // Try every possible subarray
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example input

        MaximumSubarraySum solution = new MaximumSubarraySum();
        int result = solution.findMaximumSubarraySum(array);

        System.out.println("Maximum subarray sum is: " + result);
    }
}
