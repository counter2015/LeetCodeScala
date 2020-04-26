# SameTree

## Problem link
https://leetcode.com/problems/same-tree/

## Description

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


## Example

**Example 1:**

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

**Example 2:**

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

**Example 3:**

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
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
