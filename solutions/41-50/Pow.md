# Pow(x, n)


## Problem link
https://leetcode.com/problems/powx-n/

## Description
Implement pow(x, n), which calculates x raised to the power n (xn).

Note:

-100.0 < x < 100.0
n is a 32-bit signed integer, within the range [−231, 231 − 1]
## Example

**Example 1:**

```
Input: 2.00000, 10
Output: 1024.00000
```

**Example 2:**

```
Input: 2.10000, 3
Output: 9.26100
```

**Example 3:**

```
Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
```


## Solution
Be careful, the Integer range may overflow.

Just implement it in O(log(n))




## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-22
Time |  248 ms
Memory | 41.8 MB	


