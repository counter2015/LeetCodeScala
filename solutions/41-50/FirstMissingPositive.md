# First Missing Positive

## Problem link
https://leetcode.com/problems/first-missing-positive/

## Description
Given an unsorted integer array, find the smallest missing positive integer.


**Note:**

Your algorithm should run in *O*(*n*) time and uses constant extra space.

## Example
**Example 1:**

```
Input: [1,2,0]
Output: 3
```

**Example 2:**

```
Input: [3,4,-1,1]
Output: 2
```

**Example 3:**

```
Input: [7,8,9,11,12]
Output: 1
```

## Solution
Get the max value of `nums`, iterate from 1 and return the first number not in `nums`.
Be careful for empty set.

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-10
Time | 268 ms
Memory | 44.4 MB	