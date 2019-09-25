#  Maximum Subarray

## Problem link
https://leetcode.com/problems/maximum-subarray/

## Description
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

## Example

```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

**Follow up:**

If you have figured out the O(*n*) solution, try coding another solution using the divide and conquer approach, which is more subtle.



## Solution
Consider that, if current sum result is less than 0, it should be drop and count from a new index.
Iterate from head and maintain ans = max(ans, cur)

Just implement it.


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-24
Time |  308 ms
Memory | 51.2 MB	


