# Brute Force Solution for Left Rotate Array

In the brute-force solution, we use an additional array to store the rotated values.

### Steps:
1. **Create** a temporary array to store the rotated values.
2. **Shift** each element in the original array to the left by one position.
3. **Move** the first element of the original array to the last position of the temporary array.
4. **Copy** the elements from the temporary array back to the original array.

### Time Complexity:
- **O(n)**, where `n` is the number of elements in the array.

### Space Complexity:
- **O(n)**, as we are using an additional array for the rotation.
