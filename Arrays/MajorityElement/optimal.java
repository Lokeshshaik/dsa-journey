import java.util.*;

public class MajorityElementFinder {
    
    // Method to find the majority element in the array
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        int count = 0; // Count of occurrences
        int candidate = 0; // Candidate for majority element

        // Applying Boyer-Moore Voting Algorithm to find the majority candidate
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = nums[i]; // New candidate
                count = 1;
            } else if (candidate == nums[i]) {
                count++; // Increase count for the candidate
            } else {
                count--; // Decrease count if different element found
            }
        }

        // Verifying if the candidate is indeed the majority element
        int actualCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate) {
                actualCount++;
            }
        }

        if (actualCount > (n / 2)) {
            return candidate;
        }
        return -1; // Return -1 if no majority element found
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
