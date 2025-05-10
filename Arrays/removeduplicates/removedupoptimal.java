import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int i = 0; // Pointer for last unique element
        int j = 1; // Pointer for scanning the array

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j]; // Move new unique element next to previous one
            }
            j++;
        }

        return i + 1; // Return count of unique elements
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
