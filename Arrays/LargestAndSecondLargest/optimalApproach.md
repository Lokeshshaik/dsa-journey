
3. **optimalApproach.md**: This file will contain the Optimal Approach's code and explanation.

```markdown
# Optimal Approach (One Pass)

This approach only requires one pass through the array. We update the largest and second largest elements as we go.

```java
public class LargestAndSecondLargest {
    public static void optimalApproach(int[] arr) {
        int n = arr.length;
        int largest = arr[0];  // Assume first element is the largest
        int seclargest = Integer.MIN_VALUE;  // Initialize second largest

        // 🔁 One pass through the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                seclargest = largest;  // Move old largest to second largest
                largest = arr[i];  // Update largest
            } else if (arr[i] > seclargest && arr[i] < largest) {
                seclargest = arr[i];  // Update second largest
            }
        }

        System.out.println("Optimal Approach: Largest = " + largest + ", Second Largest = " + seclargest);
    }
}
