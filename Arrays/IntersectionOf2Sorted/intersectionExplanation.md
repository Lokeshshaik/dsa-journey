🧠 Intersection of Two Sorted Arrays

This repository contains three different approaches to solving the "Intersection of Two Sorted Arrays" problem using Java.


🚀 Problem Statement

Given two sorted arrays a[] and b[], return a list of elements that appear in both arrays. The result should not contain duplicates.


📂 Brute Force Approach: Using Visited Array

✅ Compares each element in a with every element in b.

✅ Uses a visited array to avoid reusing the same element from b.

Steps:

Use a nested loop to compare every element from a with b.

Use a vis[] array to keep track of visited elements in b.

Avoid adding duplicates using size check and last added element.

Time Complexity:

O(n1 * n2)

Space Complexity:

O(n2) for the visited array.



⚡ Better Approach: Using HashSet

✅ Stores all elements of a and b in two HashSets.

✅ Finds common elements using contains() method.

✅ Finally sorts the result list.

Steps:

Insert all elements of a and b into separate hash sets.

Traverse the first set and check if elements exist in the second set.

Store common elements in a list.

Time Complexity:

O(n1 + n2 + k log k) (k = intersection size, for sorting)

Space Complexity:

O(n1 + n2)



💡 Optimal Approach: Two Pointers

✅ Uses two pointers to traverse both arrays simultaneously.

✅ Skips duplicates by checking the last inserted element.

Steps:

Start with pointers i and j at beginning of arrays a and b.

Move the smaller pointer forward.

If a[i] == b[j], add to list if not a duplicate.

Time Complexity:

O(n1 + n2)

Space Complexity:

O(1) (excluding result list)


