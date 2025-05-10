## Brute 

Sorting can be an approach when the array contains specific values like 0, 1, and 2. Sorting the array would simply arrange the elements in increasing order, which can help simplify certain problems.

## Better
Since the array only contains 3 distinct values (0, 1, and 2), we can easily count the occurrences of each value and then overwrite the array based on these counts.

Approach:

Use 3 variables to count the occurrences of 0, 1, and 2.

Traverse the array once to increment the counts for 0, 1, and 2.

In a second pass, overwrite the array: the first count_0 indices with 0, the next count_1 with 1, and the remaining count_2 with 2.

This approach ensures the array is sorted with minimal operations.

## Optimal

The problem can be optimally solved using the Dutch National Flag Algorithm.
