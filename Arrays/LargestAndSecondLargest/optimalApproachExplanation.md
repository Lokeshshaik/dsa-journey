# Optimal Approach (One Pass) Explanation

## Steps:
1. **Initialize**: Start with the first element as `largest` and a very small number (`Integer.MIN_VALUE`) as `seclargest`.
2. **Single pass through the array**: 
    - If the current element is larger than `largest`, move the current `largest` to `seclargest` and update `largest`.
    - If the current element is between `largest` and `seclargest`, update `seclargest`.

## Complexity:
- **Time Complexity**: `O(n)` because we only traverse the array once.
- **Space Complexity**: `O(1)` as we only use two variables to store `largest` and `seclargest`.

## Example:
Consider the array: `[12, 35, 1, 10, 34, 1]`
- Traverse once:
    - Largest: `35`
    - Second Largest: `34`
