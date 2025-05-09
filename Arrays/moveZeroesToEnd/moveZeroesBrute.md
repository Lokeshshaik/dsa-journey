# Brute Force Approach: Move Zeroes to End

In the brute force solution, we use an additional temporary array (`ArrayList`) to store non-zero elements and then reconstruct the original array.

### Steps:
1. Traverse the array and copy all non-zero elements to a temporary array.
2. Copy back the non-zero elements to the original array from the beginning.
3. Fill the remaining positions in the array with zeroes.

### Time Complexity:
- O(n) for traversing the array twice.

### Space Complexity:
- O(n) due to the use of an extra list to store non-zero elements.

This method is simple but uses extra space.
