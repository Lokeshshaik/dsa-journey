# Optimal Solution for Left Rotate Array

In the optimal solution, we rotate the array in-place without using any additional space.

### Steps:
1. **Store** the first element of the array in a temporary variable.
2. **Shift** the elements of the array to the left by one position.
3. **Place** the first element from the temporary variable into the last position of the array.

### Time Complexity:
- **O(n)**, where `n` is the number of elements in the array.

### Space Complexity:
- **O(1)**, as no additional space is used besides a single temporary variable.
