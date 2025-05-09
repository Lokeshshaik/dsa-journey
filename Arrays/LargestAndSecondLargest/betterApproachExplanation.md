# Better Approach (Two Passes) Explanation

## Steps:
1. **First pass (Find largest)**: Traverse the array once to find the largest element.
2. **Second pass (Find second largest)**: Traverse the array again and look for the largest element that is smaller than the largest found in the first pass.

## Complexity:
- **Time Complexity**: `O(n) + O(n) = O(n)` for the two passes.
- **Space Complexity**: `O(1)` as only a few variables are used.

## Example:
Consider the array: `[12, 35, 1, 10, 34, 1]`
- First pass finds the largest element: `35`
- Second pass finds the second largest: `34`
