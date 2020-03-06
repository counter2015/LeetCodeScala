# Decode Ways

## Problem link
https://leetcode.com/problems/interleaving-string/

## Description

Given *s1*, *s2*, *s3*, find whether *s3* is formed by the interleaving of *s1* and *s2*.

## Example

**Example 1:**

```
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
```

**Example 2:**

```
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false
```

## Solution
A classic DP problem.
We can init dp(i+1)(j+1) as false value, where i is the length of string `s1`,
j is the length og string `s2`. Suppose k is the length of string `s3`.
If i + j != k then return false directly.

In other condition, init dp(0)(0) as true for reason that empty string plus empty string equals empty string.

State transfer equation:
`dp[i][j] = (dp[i - 1][j] && s1[i - 1] == s3[i + j - 1]) || (dp[i][j - 1] && s2[j - 1] == s3[i + j - 1])`

The answer is just `dp[s1.length+1][s2.length+1]`.

## Run Time Info

\- | \-
------------ | -------------
Date | 2020-03-06
Time | 460 ms
Memory | 52.2 MB
