# 🌳 Brute Force: Union Using TreeSet

### Steps:
1. Insert all elements of both arrays into a `TreeSet` (auto-sorts + removes duplicates).
2. Convert the `TreeSet` to an `ArrayList`.

### Time Complexity:
- O((n + m) * log(n + m)) — due to TreeSet insertions.

### Space Complexity:
- O(n + m) — new TreeSet and ArrayList.
