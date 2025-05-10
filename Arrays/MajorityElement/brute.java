import java.util.*;

public class MajorityElementFinder {
    
    // Method to find the majority element in the array
    public static int findMajorityElement(int[] nums) {
        // Size of the array
        int n = nums.length;

        // Iterate through each element to check its frequency
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Count how many times the current element appears in the array
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            // Check if the frequency of the element is greater than n/2
            if (count > (n / 2)) {
                return nums[i];
            }
        }

        // Return -1 if no majority element is found
        return -1;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        
        // Find the majority element
        int result = findMajorityElement(arr);
        
        // Print the result
        System.out.println("The majority element is: " + result);
    }
}
