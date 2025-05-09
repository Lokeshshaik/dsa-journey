# Largest and Second Largest Algorithms

This repository demonstrates three different approaches for finding the largest and second largest elements in an array. Each approach is implemented in a separate directory, and each directory contains a detailed `README.md` describing the implementation and the time/space complexities.

## Approaches

1. [Brute Force Approach](./brute-force/README.md)
2. [Better Approach](./better-approach/README.md)
3. [Optimal Approach](./optimal-approach/README.md)

### Code Files
Each approach has its own Java file:
- [Brute Force Approach](./brute-force/LargestAndSecondLargestBruteForce.java)
- [Better Approach](./better-approach/LargestAndSecondLargestBetterApproach.java)
- [Optimal Approach](./optimal-approach/LargestAndSecondLargestOptimalApproach.java)
 # Brute Force Approach

This directory contains the code for the **Brute Force Approach** to find the largest and second largest elements in an array.

### Approach
1. Sort the array in ascending order.
2. The largest element will be the last element in the sorted array.
3. Iterate backward through the array to find the first element smaller than the largest.

### Code
The Java code for this approach can be found in [LargestAndSecondLargestBruteForce.java](./LargestAndSecondLargestBruteForce.java).

### Complexity:
- **Time Complexity**: O(n log n) (due to sorting).
- **Space Complexity**: O(1) (constant space for variables).
# Better Approach

This directory contains the code for the **Better Approach** to find the largest and second largest elements in an array.

### Approach
1. Find the largest element first by looping through the array.
2. Then, loop again to find the second largest element (must be less than the largest).

### Code
The Java code for this approach can be found in [LargestAndSecondLargestBetterApproach.java](./LargestAndSecondLargestBetterApproach.java).

### Complexity:
- **Time Complexity**: O(n).
- **Space Complexity**: O(1) (constant space for variables).
# Optimal Approach

This directory contains the code for the **Optimal Approach** to find the largest and second largest elements in an array.

### Approach
1. Initialize two variables: `largest` and `seclargest`.
2. Traverse the array only once:
   - If an element is larger than `largest`, update both `seclargest` and `largest`.
   - If an element is between `seclargest` and `largest`, update `seclargest`.

### Code
The Java code for this approach can be found in [LargestAndSecondLargestOptimalApproach.java](./LargestAndSecondLargestOptimalApproach.java).

### Complexity:
- **Time Complexity**: O(n).
- **Space Complexity**: O(1) (constant space for variables).
