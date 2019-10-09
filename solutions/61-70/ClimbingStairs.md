# Climbing Stairs

## Problem link
https://leetcode.com/problems/climbing-stairs/

## Description
You are climbing a stair case. It takes *n* steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

**Note:** Given *n* will be a positive integer.
## Example
**Example 1:**

```
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```

**Example 2:**

```
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```


## Solution

For ease of calculation, we define f(0) = 1, 
We know that:
```
f(1) = 1
f(2) = f(1) + f(0) = 2,
```

For all n > 2
f(n) = f(n-1) + f(n-2)
Just implement it.

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-10-09
Time | 192 ms
Memory | 39 MB	


