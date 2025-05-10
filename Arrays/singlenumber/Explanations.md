## 🌳 Brute

For every number num in the array:
It counts how many times num appears in the array.
If the count is 1, it returns that number.
This works because all other numbers appear exactly twice.

## ⏱ Time Complexity:

Outer loop: O(n)
Inner loop (counting): O(n)
Total: O(n²)

## 💾 Space Complexity:

O(1) — No extra memory used (just variables).

## ⚡ Optimal

XOR has two useful properties:
a ^ a = 0 (same numbers cancel each other)
a ^ 0 = a (identity)
So, if every number appears twice except one, XORing all numbers will leave only the unique one.

## ⏱ Time Complexity:

Loop runs once over the array: O(n)

## 💾 Space Complexity:

O(1) — Only one variable xor is used.
