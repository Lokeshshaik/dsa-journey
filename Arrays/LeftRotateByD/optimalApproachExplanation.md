## Optimal Approach Explanation (Reversal Algorithm)

**Idea:**  
We reverse parts of the array in three steps to achieve left rotation.

**Steps:**  
1. Reverse first `d` elements.  
2. Reverse the remaining `n - d` elements.  
3. Reverse the entire array.

**Why it works?**  
Reversing segments allows the rotated order to align correctly.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
