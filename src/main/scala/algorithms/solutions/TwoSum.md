# Two Sum Solution

## Problem Link 
https://leetcode.com/problems/two-sum/

## Description

Given an array of integers `nums`, return position of the two numbers such that they add up to target result.

- Each input would have **exactly one** solution
- You may not use the **same** element twice.
- `nums` index from **0**
- The order of results is not important.

## Example

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. [1, 0] is also right answer.

## Solution
1. Sort `nums` with index, for [7,2,11,15], should be [(2,0), (7,1), (11,2), (15,3)], lets say the result is `arr`

2. Suppose `value` is the sum of value of first and last element `arr` 
  - if `value` == `target` return the index of first and last element.
  - if `value` < `target`  return to Step 2 with new `arr` where `arr` exclude first element.
  - if `value` > `target`  return to Step 2 with new `arr` where `arr` exclude last element. 
  
Total time complexity is O(nlogn)

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-01
Time | 320 ms
Memory | 50.2 MB	