# 🔗 Intersection of Two Sorted Arrays - Java Solutions

This repository provides three Java solutions for finding the **intersection** of two sorted arrays.

---

## 🧠 Brute Force Approach (Using Visited Array)

✅ Uses a visited array to avoid duplicates and nested loops to match elements.

- 📄 [intersectionBruteVis.java](intersectionBruteVis.java)  

---

## ⚙️ Better Approach (Using HashSet)

✅ Uses two hash sets to collect common elements, then sorts the result.

- 📄 [intersectionBetterHashSet.java](intersectionBetterHashSet.java)  

---

## 🚀 Optimal Approach (Two Pointers)

✅ Uses two pointers to traverse both arrays in a single pass without extra space.

- 📄 [intersectionOptimal.java](intersectionOptimal.java)  


- 📝 [intersectionExplanation.md](intersectionExplanation.md)
---

## 💡 Problem Statement

> Given two sorted arrays, return a list containing all the elements present in both arrays. The result must not contain duplicates and should be in sorted order.

---

## ✨ Sample Input

```java
int[] a = {1, 2, 2, 3, 4};
int[] b = {2, 2, 4, 6};
