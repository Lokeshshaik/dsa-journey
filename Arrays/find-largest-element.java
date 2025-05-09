import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    // Optimal Solution: Time : O(n) , Space : O(1)
    public static int findLargestOptimal(int[] arr) {
        int max = arr[0];  // Assume first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if a larger element is found
            }
        }
        return max;
    }

    // Brute force Solution using Sorting: Time : O(n log n) , Space : O(1)
    public static int findLargestBruteForce(int[] arr) {
        Arrays.sort(arr);          // Sort array in ascending order
        return arr[arr.length - 1]; // The largest element is now the last one
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare and input array
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Brute Force approach
        int largestBruteForce = findLargestBruteForce(arr);
        System.out.println("The largest element (Brute Force): " + largestBruteForce);

        // Optimal approach
        int largestOptimal = findLargestOptimal(arr);
        System.out.println("The largest element (Optimal): " + largestOptimal);

        sc.close();
    }
}
