class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;        // Length of the array
        int low = 0, mid = 0, high = n - 1;  // Initialize three pointers
        
        // Traverse the array while mid pointer is less than or equal to high pointer
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], then move both low and mid pointers forward
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Just move the mid pointer forward when we encounter 1
                mid++;
            } else {
                // Swap nums[mid] and nums[high], then move high pointer backward
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {2, 0, 2, 1, 1, 0};

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the sortColors method
        solution.sortColors(nums);

        // Print the sorted array
        System.out.println("Sorted Array: " + java.util.Arrays.toString(nums));
    }
}
