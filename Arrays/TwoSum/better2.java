import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> hp = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Get the current number and its complement needed to reach the target
            int num = nums[i];
            int needed = target - num;

            // If the complement is found in the map, return the indices
            if (hp.containsKey(needed)) {
                return new int[]{hp.get(needed), i};
            }

            // If the complement is not found, add the current number and index to the map
            hp.put(num, i);
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
