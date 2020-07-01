# Distinct Subsequences

## Problem link
https://leetcode.com/problems/distinct-subsequences/

## Description

Given a string **S** and a string **T**, count the number of distinct subsequences of **S** which equals **T**.

A subsequence of a string is a new string which is formed from the original string by 

deleting some (can be none) of the characters without disturbing the relative positions of 

the remaining characters. (ie, `"ACE"` is a subsequence of `"ABCDE"` while `"AEC"` is not).

It's guaranteed the answer fits on a 32-bit signed integer.



## Example

**Example 1:**

```
Input: S = "rabbbit", T = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from S.
(The caret symbol ^ means the chosen letters)

rabbbit
^^^^ ^^
rabbbit
^^ ^^^^
rabbbit
^^^ ^^^
```

**Example 2:**

```
Input: S = "babgbag", T = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from S.
(The caret symbol ^ means the chosen letters)

babgbag
^^ ^
babgbag
^^    ^
babgbag
^    ^^
babgbag
  ^  ^^
babgbag
    ^^^
    
    

```




## Solution
Just implement it. It'a a dp problem.

We can easily find that 

```
dp(m,n) = dp(m-1,n)               if s(m) unequals t(n)
          dp(m-1,n-1) + dp(m-1,n) if s(m) equals t(n)
```

For example 2, we can list table following

```
- Ø b a b g b a g
Ø 1 1 1 1 1 1 1 1
b 0 1 1 2 2 3 3 3
a 0 0 1 1 1 1 4 4
g 0 0 0 0 1 1 1 5
```

## Run Time Info

\- | \-
------------ | -------------
Date | 2020-07-01
Time | 460 ms
Memory | 50.3 MB
