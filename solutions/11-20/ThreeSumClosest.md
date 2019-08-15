#  3Sum Closest

## Problem link
https://leetcode.com/problems/3sum-closest/

## Description
Given an array nums of n integers and an integer target,
find three integers in nums such that the sum is closest to target.

 Return the sum of the three integers.
  You may assume that each input would have exactly one solution.


## Example

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

## Solution
We can first set `a` at [0, n-2],
set`b` at a + 1,
set `c` at n-1

Suppose arr is sorted array from `nums`
let sum = arr(a) + arr(b) + arr(c)
if sum == 0, add (a,b,c) to result list,
if sum < 0, let b = b + 1, and check sum again,
if sum > 0, let c = c - 1, and check sum again.

renew res during the iteration ,
where
res = abs(res - target) < abs(sum - target) ? res : sum

This solution will cost O(n*n) time.



## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-16
Time | 	328ms
Memory |  46.7MB


