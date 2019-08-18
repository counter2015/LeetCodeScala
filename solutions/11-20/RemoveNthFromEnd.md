# Remove Nth Node From End of List

## Problem link
https://leetcode.com/problems/remove-nth-node-from-end-of-list/

## Description
Given a linked list, remove the n-th node from the end of list and return its head.

Note: Given n will always be valid.


## Example

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.


## Solution
Iterate the ListNodes twice, once for get the length, once for iterate to the
index to remove the element. And just implement it.


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-18
Time | 	 276ms
Memory |  46.3MB	
