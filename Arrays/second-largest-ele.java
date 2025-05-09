import java.util.Arrays;

public class LargestAndSecondLargest {

// 👉 Brute Force Approach:
// Step 1: Sort the array in ascending order
// Step 2: Largest element is at the last index
// Step 3: Iterate from end to find first element smaller than the largest

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

/*
🧠 Explanation:
- We first sort the array in ascending order using Arrays.sort().
- After sorting, the largest element will be at the end (arr[n - 1]).
- Then we loop backwards to find the first smaller value, which will be the second largest.

📊 Complexity:
Time Complexity: O(n log n)
- Sorting takes O(n log n)
- Backward loop takes O(n)
- Overall: O(n log n)

Space Complexity: O(1)
- Only a few integer variables (`largest`, `seclargest`) are used → constant space
*/


// 👉 Better Approach:
// Step 1: Loop to find the largest element
// Step 2: Loop again to find the second largest element (less than the largest)
// ✅ No sorting needed, just two passes

public static void betterApproach(int[] arr) {
    int n = arr.length;
    int largest = arr[0];

    // 🔁 Find largest
    for (int i = 0; i < n; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    int seclargest = Integer.MIN_VALUE;

    // 🔁 Find second largest
    for (int i = 0; i < n; i++) {
        if (arr[i] > seclargest && arr[i] < largest) {
            seclargest = arr[i];
        }
    }

    System.out.println("Better Approach: Largest = " + largest + ", Second Largest = " + seclargest);
}

/*
🧠 Explanation:
- First pass to find largest element.
- Second pass to find the second largest (less than largest, but greater than all others).
- Easy to follow, no need to sort.

📊 Complexity:
Time: O(n) + O(n) = O(n)
Space: O(1) (constant variables used)
*/

    
// 👉 Optimal Approach: One Pass
// Step 1: Initialize `largest` as first element, `seclargest` as very small number
// Step 2: Traverse once through the array
// Step 3: Update `largest` and shift old `largest` to `seclargest`
// Step 4: If not largest but greater than `seclargest`, update `seclargest`

public static void optimalApproach(int[] arr) {
    int n = arr.length;
    int largest = arr[0];                    // ✅ Assume first is largest initially
    int seclargest = Integer.MIN_VALUE;      // 🧊 Smallest possible value for comparison

    // 🔁 One-pass traversal
    for (int i = 0; i < n; i++) {
        if (arr[i] > largest) {
            seclargest = largest;            // 📤 Push down old largest
            largest = arr[i];                // ✅ New largest found
        } else if (arr[i] > seclargest && arr[i] < largest) {
            seclargest = arr[i];             // ✅ Update second largest
        }
    }

    System.out.println("Optimal Approach: Largest = " + largest + ", Second Largest = " + seclargest);
}

/*
🧠 Explanation:
- Initialize two variables: `largest` and `seclargest`.
- Traverse the array once:
    - If current element > largest → update both `seclargest` and `largest`
    - Else if it's between `seclargest` and `largest`, update `seclargest`

📊 Complexity:
Time Complexity: O(n)
- Only one pass through the array

Space Complexity: O(1)
- Only two integer variables are used → constant space
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
