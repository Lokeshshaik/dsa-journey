# Brute Force Approach Explanation

## Steps:
1. **Sort the array**: First, we sort the array in ascending order using `Arrays.sort()`.
2. **Find the largest element**: After sorting, the largest element will be the last element in the array.
3. **Find the second largest**: We iterate through the array backward and find the first element that is not equal to the largest. This will be our second largest element.

## Complexity:
- **Time Complexity**: `O(n log n)` for sorting, and then `O(n)` for iterating backward. Overall, `O(n log n)`.
- **Space Complexity**: `O(1)` because we only use a few variables to store the largest and second largest elements.

## Example:
Consider the array: `[12, 35, 1, 10, 34, 1]`
- After sorting: `[1, 1, 10, 12, 34, 35]`
- Largest: `35`
- Second Largest: `34`
