public class MaximumSubarrayKadane {

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public int findMaximumSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            // If current sum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example input

        MaximumSubarrayKadane solution = new MaximumSubarrayKadane();
        int result = solution.findMaximumSubarraySum(array);

        System.out.println("Maximum subarray sum is: " + result);
    }
}
