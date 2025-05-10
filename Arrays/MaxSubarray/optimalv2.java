public class MaximumSubarrayIndices {

    // Function to find the start and end indices of the maximum subarray
    public int[] findMaxSubarrayIndices(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ansStart = -1, ansEnd = -1;

        for (int i = 0, start = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }

            sum += nums[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return new int[]{ansStart, ansEnd};
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        MaximumSubarrayIndices solution = new MaximumSubarrayIndices();
        int[] result = solution.findMaxSubarrayIndices(nums);

        System.out.println("Maximum subarray starts at index " + result[0] +
                           " and ends at index " + result[1]);
    }
}
