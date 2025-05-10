import java.util.Arrays;

public class TwoSumSolver {
    
    // Method to find if there are two numbers in the array that sum up to the target
    public static String findTwoSum(int n, int[] arr, int target) {
        // Sort the array to use two-pointer technique
        Arrays.sort(arr);

        // Initialize two pointers: left and right
        int left = 0, right = n - 1;

        // Loop until the pointers meet
        while (left < right) {
            // Calculate the sum of the two numbers pointed by left and right
            int sum = arr[left] + arr[right];

            // Check if we found the target sum
            if (sum == target) {
                return "YES";  // Target sum found
            } else if (sum < target) {
                left++;  // Move left pointer to the right to increase the sum
            } else {
                right--;  // Move right pointer to the left to decrease the sum
            }
        }

        // If no such pair is found, return "NO"
        return "NO";
    }

    public static void main(String[] args) {
        // Example inputs
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        // Call the method to find if a pair exists
        String result = findTwoSum(n, arr, target);

        // Print the result
        System.out.println("This is the answer for variant 1: " + result);
    }
}
