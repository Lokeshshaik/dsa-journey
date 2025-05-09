## Brute Force Approach Explanation

**Idea:**  
Store the first `d` elements in a temporary array.  
Shift the remaining elements to the left.  
Then place the saved elements at the end.

**Steps:**  
1. Create a temp array to store first `d` elements.
2. Shift the remaining `n - d` elements to the left.
3. Copy back the `d` elements from temp to the end of array.

**Time Complexity:** O(n)  
**Space Complexity:** O(d)
