# Median of Two Sorted Arrays

## Problem Link 
https://leetcode.com/problems/median-of-two-sorted-arrays/

## Description

Given two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be **O(log (m+n))**.

You may assume nums1 and nums2 cannot be both empty.

## Example

**Example 1:**

nums1 = [1, 3]
nums2 = [2]

The median is 2.0

**Example 2:**

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

## Solution
Suppose there are two arrays , array `a` , length of `a` is m, array `b`, length of `b` is n.

when we spilt at (i, j) on array(a, b)

          left_part          |        right_part
    A[0], A[1], ..., A[i-1]  |  A[i], A[i+1], ..., A[m-1]
    B[0], B[1], ..., B[j-1]  |  B[j], B[j+1], ..., B[n-1]


When (m + n) % 2 == 0 

if length(left_part) == length(right_part)

and a[i-1] <= b[j] and b[j-1] <= a[i]

the median = (max(a[i-1], b[j-1]) + min (a[i], b[j])) / 2.0

When (m + n) % 2 == 1

if length(left_part) == length(right_part) + 1

and a[i-1] <= b[j] and b[j-1] <= a[i]

the median = max(a[i-1], b[j-1]) 

**NOTE** consider the edges value, such as i == 0, i == m, j == 0, j ==n, 
where a[i-1], a[i], b[j-1], b[j] may throw `ArrayIndexOutOfBoundsException`,
, another edges condition is one of the array is null, this situation will degenerate into the problem of finding the median of one-dimensional ordered array.

Total time complexity is O(log(min(n ,m)))

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-05
Time | 	440 ms
Memory | 62.5 MB	




