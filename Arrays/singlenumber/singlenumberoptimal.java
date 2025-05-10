public class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i]; // XOR cancels out duplicates
        }
        return xor;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 3, 5, 4, 5, 3, 4};  // Only 2 appears once
        int result = sol.singleNumber(nums);
        System.out.println("The single number is: " + result);  // Output: 2
    }
}
