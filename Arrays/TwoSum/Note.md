## Two Sum Problem
Two-Pointer Approach:
Description: The array is first sorted, and then two pointers (left and right) are used to check pairs of numbers that sum to the target. If the sum of the numbers at both pointers equals the target, we return "YES". If the sum is smaller, we move the left pointer to the right (increase the sum), and if the sum is larger, we move the right pointer to the left (decrease the sum).

Time Complexity: O(n log n) (due to sorting) + O(n) (two-pointer traversal) → O(n log n)

Space Complexity: O(1) (in-place sorting)

Limitation: Since the array is sorted, we lose the original indices of the elements, making it unsuitable for scenarios where the indices need to be returned.

## HashMap Approach:
Description: A HashMap is used to store the numbers and their corresponding indices while iterating through the array. For each number, we calculate its complement (the difference between the target and the current number) and check if it's already in the map. If found, we return the indices of the two numbers. This approach avoids sorting and directly returns the correct indices.

Time Complexity: O(n) (single pass through the array)

Space Complexity: O(n) (additional space for the HashMap)

Advantage: This approach avoids sorting, maintains the original indices, and is faster in terms of time complexity, making it ideal for interviews and real-world applications.
