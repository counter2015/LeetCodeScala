# Flatten Binary Tree to Linked List

## Problem link
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

## Description

Given a binary tree, flatten it to a linked list in-place.



## Example

For example, given the following tree:

```
    1
   / \
  2   5
 / \   \
3   4   6
```

The flattened tree should look like:

```
1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
```





## Solution
A mutable problem is not good for scala, the problem tells us to convert TreeNode to ListNode,
however it just changes the struct of the tree to a leaned tree which pretend itself to be at
ListNode.

## Run Time Info

\- | \-
------------ | -------------
Date | 2020-07-01
Time |  520 ms
Memory |  51 MB
