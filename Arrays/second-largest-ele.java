import java.util.Arrays;

public class LargestAndSecondLargest {

    // Brute Force Approach
    public static void bruteForce(int[] arr) {
        Arrays.sort(arr); 
        int n = arr.length;
        int largest = arr[n - 1];
        int seclargest = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                seclargest = arr[i];
                break;
            }
        }
        
        System.out.println("Brute Force: Largest = " + largest + ", Second Largest = " + seclargest);
    }
 /*
 * Explanation:
 * - We first sort the array in ascending order using Arrays.sort(). Sorting the array allows the largest element to be at the last position.
 * - After sorting, the largest element is found at `arr[n - 1]`, where `n` is the length of the array.
 * - We then iterate backward through the sorted array to find the second largest element (this element is the first one that isn't equal to the largest).
 * 
 * Complexity Analysis:
 * Time Complexity: O(n log n)
 * - Sorting the array takes O(n log n) time, and then we perform a single iteration to find the second largest element, which is O(n).
 * 
 * Space Complexity: O(1)
 * - We are only using a few extra variables (`largest`, `seclargest`) to store the results, which takes constant space.
 */

    // Better Approach: Sorting 
    public static void betterApproach(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int seclargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > seclargest && arr[i] < largest) {
                seclargest = arr[i];
            }
        }
        
        System.out.println("Better Approach: Largest = " + largest + ", Second Largest = " + seclargest);
    }
 /*
 * Explanation:
 * - This approach first finds the largest element by iterating through the array once.
 * - Then, in a second loop, it finds the second largest element by checking elements that are
 *   less than the largest but greater than the current second largest.
 * - It uses two passes over the array, but does not require sorting.
 * 
 * Complexity Analysis:
 * Time Complexity: O(n)
 * - First loop to find the largest: O(n)
 * - Second loop to find second largest: O(n)
 * - Total: O(n) + O(n) = O(n)
 * 
 * Space Complexity: O(1)
 * - Only two integer variables (`largest` and `seclargest`) are used, which takes constant space.
 */
    
    // Optimal Approach: One Pass 
    public static void optimalApproach(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;
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
 /*
 * Explanation:
 * - This approach finds both the largest and second largest elements in a single traversal of the array.
 * - It initializes `largest` with the first element and `seclargest` with Integer.MIN_VALUE.
 * - As it iterates through the array:
 *   → If the current element is greater than `largest`, then `seclargest` is updated to `largest`, and `largest` is updated to the current element.
 *   → Else if the current element is greater than `seclargest` and less than `largest`, then update `seclargest`.
 * - This ensures the second largest value is always just behind the largest without needing sorting or multiple passes.
 * 
 * Complexity Analysis:
 * Time Complexity: O(n)
 * - Only one pass through the array is needed, so it's linear in time.
 * 
 * Space Complexity: O(1)
 * - Only two variables (`largest` and `seclargest`) are used, so constant space is required.
 */


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
