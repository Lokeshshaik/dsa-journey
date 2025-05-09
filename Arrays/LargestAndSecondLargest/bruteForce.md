# Brute Force Approach

This approach involves sorting the array first and then finding the second largest element by iterating from the end.

```java
import java.util.Arrays;

public class LargestAndSecondLargest {
    public static void bruteForce(int[] arr) {
        Arrays.sort(arr);  // 🔁 Sort the array
        int n = arr.length;
        int largest = arr[n - 1];  // ✅ Largest is last element after sorting
        int seclargest = Integer.MIN_VALUE;

        // 🔁 Iterate backward to find the second largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                seclargest = arr[i];
                break;
            }
        }

        System.out.println("Brute Force: Largest = " + largest + ", Second Largest = " + seclargest);
    }
}
