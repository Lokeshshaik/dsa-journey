public class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == num) {
                    count += 1;
                }
            }
            if(count == 1) {
                return nums[i]; // return the number that appears only once
            }
        }
        return 0; // default return (though this should not happen per problem constraints)
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single number is: " + sol.singleNumber(nums));  // Output: 4
    }
}
