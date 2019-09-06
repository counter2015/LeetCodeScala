# Search in Rotated Sorted Array

## Problem link
https://leetcode.com/problems/search-in-rotated-sorted-array/

## Description
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., `[0,1,2,4,5,6,7]` might become `[4,5,6,7,0,1,2]`).

You are given a target value to search. If found in the array return its index, otherwise return `-1`.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of *O*(log *n*).

## Example
**Example 1:**

```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```

**Example 2:**

```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```



## Solution

This is a variation of binary search algorithms, if we split the array to same length two part,
there should be a sorted and one not sorted. The sort one can check the target easily.

Just implement it.

 
  
    
## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-06
Time | 276 ms
Memory | 46.8 MB	