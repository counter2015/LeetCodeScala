# N-Queens

## Problem link
https://leetcode.com/problems/n-queens/

## Description
The *n*-queens puzzle is the problem of placing *n* queens on an *n*×*n* chessboard such that no two queens attack each other.

![img](https://assets.leetcode.com/uploads/2018/10/12/8-queens.png)

Given an integer *n*, return all distinct solutions to the *n*-queens puzzle.

Each solution contains a distinct board configuration of the *n*-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space respectively.

## Example

```
Input: 4
Output: [
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
```

## Solution

Suppose we just implement a function with signature `place(n: Int, size: Int): List[List[(Int, Int)]]`,

it will get the last lines of queens positions, then we can solve the problem recursively.

for all the `queens` in `place(n-1, size)`, try pos from 0 until size, check the position (n, pos) is safe of not.





## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-23
Time |  340 ms
Memory | 50.2 MB	


