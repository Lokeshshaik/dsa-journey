
2. **betterApproach.md**: This file will contain the Better Approach (Two Passes) approach's code and explanation.

```markdown
# Better Approach (Two Passes)

In this approach, we make two passes through the array. The first pass finds the largest element, and the second pass finds the second largest.

```java
public class LargestAndSecondLargest {
    public static void betterApproach(int[] arr) {
        int n = arr.length;
        int largest = arr[0];  // 🔁 Find largest

        // 🔁 First pass to find largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int seclargest = Integer.MIN_VALUE; // 🔁 Find second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > seclargest && arr[i] < largest) {
                seclargest = arr[i];
            }
        }

        System.out.println("Better Approach: Largest = " + largest + ", Second Largest = " + seclargest);
    }
}
