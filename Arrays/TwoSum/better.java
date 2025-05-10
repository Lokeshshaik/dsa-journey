import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> hp = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int rem = target - nums[i];

            // If the complement is already in the map, return the result
            if (hp.containsKey(rem)) {
                return new int[]{hp.get(rem), i};
            }

            // Otherwise, store the current number and its index in the map
            hp.put(nums[i], i);
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
