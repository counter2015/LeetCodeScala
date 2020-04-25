# Recover Binary Search Tree

## Problem link
https://leetcode.com/problems/recover-binary-search-tree

## Description

Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.

## Example

**Example 1:**

```
Input: [1,3,null,null,2]

   1
  /
 3
  \
   2

Output: [3,1,null,null,2]

   3
  /
 1
  \
   2
```

**Example 2:**

```
Input: [3,1,4,null,null,2]

  3
 / \
1   4
   /
  2

Output: [2,1,4,null,null,3]

  2
 / \
1   4
   /
  3
```

## Solution
A trivial solution:

Just traversal the tree and sort the values, then fill them back to the tree in order.
This will cost O(n) place.

Another solution is Morris Traversal

Reference:
https://www.educative.io/edpresso/what-is-morris-traversal
https://www.cnblogs.com/AnnieKim/archive/2013/06/15/MorrisTraversal.html

todo Morris 遍历
https://www.cnblogs.com/grandyang/p/4298069.html

## Run Time Info

\- | \-
------------ | -------------
Date | 2020-04-25
Time | 592 ms
Memory | 54.1 MB
