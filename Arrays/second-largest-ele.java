import java.util.Arrays;

public class LargestAndSecondLargest {

    // Brute Force Approach
    public static void bruteForce(int[] arr) {
        Arrays.sort(arr);          // Sort the array in ascending order
        
        int n = arr.length;
        int largest = arr[n - 1];  // The largest element will be at the last position
        int seclargest = Integer.MIN_VALUE;
        
        // Find the second largest element by iterating backwards
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                seclargest = arr[i];
                break;
            }
        }
        
        System.out.println("Brute Force: Largest = " + largest + ", Second Largest = " + seclargest);
    }

    // Better Approach: Sorting 
    public static void betterApproach(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        
        // Find the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        int seclargest = Integer.MIN_VALUE;
        
        // Find the second largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > seclargest && arr[i] < largest) {
                seclargest = arr[i];
            }
        }
        
        System.out.println("Better Approach: Largest = " + largest + ", Second Largest = " + seclargest);
    }
    
    // Optimal Approach: One Pass 
    public static void optimalApproach(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;
        
        // Find largest and second largest in one pass
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                seclargest = largest;
                largest = arr[i];
            } else if (arr[i] > seclargest && arr[i] < largest) {
                seclargest = arr[i];
            }
        }
        
        System.out.println("Optimal Approach: Largest = " + largest + ", Second Largest = " + seclargest);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Call Brute Force approach
        bruteForce(arr);

        // Call Better approach using sorting
        betterApproach(arr);

        // Call Optimal approach
        optimalApproach(arr);
    }
}
