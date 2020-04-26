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
lol, the problem is just in my strike zone, since I have written test in `algorithms.struct.TreeNodeTest.sameElement`

see https://github.com/counter2015/LeetCodeScala/blob/master/src/test/scala/algorithms/struct/TreeNodeTest.scala#L55-L60

Well, since you can't test code by itself, I wrote it another way.
## Run Time Info

\- | \-
------------ | -------------
Date | 2020-04-26
Time |  852 ms
Memory |  61.9 MB
