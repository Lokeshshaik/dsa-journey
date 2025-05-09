# Optimal Approach: Move Zeroes to End

This solution moves all zeroes to the end **in-place** using two pointers.

### Steps:
1. Find the first occurrence of zero.
2. From the next index, if a non-zero is found, swap it with the zero found earlier.
3. Continue until the end of the array.

### Time Complexity:
- O(n): Single pass through the array after the initial zero search.

### Space Complexity:
- O(1): No extra space used.

Efficient for large datasets.
