# Merge k Sorted Lists

## Problem link
https://leetcode.com/problems/merge-k-sorted-lists/

## Description
Merge k sorted linked lists and return it as one sorted list. 
Analyze and describe its complexity.
## Example

```
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
```


## Solution
Since each ListNode in array is sorted, so we just to compare the min value of 
first element, and let the point to the next node.

Implement it and time costs O(n), n is then nodes' number.


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-25
Time | 	1072 ms
Memory | 61.7 MB	