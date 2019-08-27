# Reverse Nodes in k-Group

## Problem link
https://leetcode.com/problems/reverse-nodes-in-k-group/

## Description
Given a linked list, reverse the nodes of a linked list *k* at a time and return its modified list.

*k* is a positive integer and is less than or equal to the length of the linked list. 
If the number of nodes is not a multiple of *k* then left-out nodes in the end should remain as it is.## Example

**Note:**

- Only constant extra memory is allowed.
- You may not alter the values in the list's nodes, only nodes itself may be changed.

## Example

Given this linked list: `1->2->3->4->5`

For *k* = 2, you should return: `2->1->4->3->5`

For *k* = 3, you should return: `3->2->1->4->5`


## Solution
Just implement it. 
First check remain nodes greater than k, if yes , reverse them, else 
the last (n % k) nodes should not be reverse and should be contact the former result.


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-27
Time | 	484 ms
Memory | 53.6 MB	