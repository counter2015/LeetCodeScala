# Add Two Numbers

## Problem Link 
https://leetcode.com/problems/add-two-numbers/

## Description
Given two **non-empty** linked lists representing two non-negative integers. 

The digits are stored in **reverse order** and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Example

```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

## Solution

Just implement it as number add.

Note that there are following boundary conditions

Total time complexity is O(max(m, n))

- 0 + 0
- 1 + 99999999999999

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-01
Time | 368 ms
Memory | 55.8 MB	