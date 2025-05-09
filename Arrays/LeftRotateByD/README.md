# Left Rotate Array by D Positions

This contains both **Brute Force** and **Optimal** solutions for rotating an array to the left by `d` positions.


## Brute Force Solution

In this solution, we use an additional temporary array to store the first `d` elements, then shift the rest and finally put the temp values at the end.

- [Brute Force Code](./bruteForce.md)
- [Brute Force Explanation](./bruteForceExplanation.md)

---

## Optimal Solution (Reversal Algorithm)

This optimal approach rotates the array in-place using the reversal algorithm, without using extra space.

- [Optimal Code](./optimalApproach.md)
- [Optimal Explanation](./optimalApproachExplanation.md)
