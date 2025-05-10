class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Get the length of the array
        int n = nums.length;

        // Iterate through the array with two pointers
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the two numbers equals the target
                if (nums[i] + nums[j] == target) {
                    // If found, return the indices of the two numbers
                    return new int[]{i, j};
                }
            }
        }

        // If no solution is found, return null
        return null;
    }

    public static void main(String[] args) {
        // Example usage
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Calling the twoSum method
        int[] result = solution.twoSum(nums, target);
        
        // Printing the result
        if (result != null) {
            System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
