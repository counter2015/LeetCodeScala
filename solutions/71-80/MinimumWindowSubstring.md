# Minimum Window Substring

## Problem link
https://leetcode.com/problems/minimum-window-substring/

## Description

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

**Note:**

- If there is no such window in S that covers all characters in T, return the empty string `""`.
- If there is such window, you are guaranteed that there will always be only one unique minimum window in S.


## Example


```
Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
```


## Solution

Window problem can solve by window, just record the last index of each character and update it the minimum size.

A simple implement
```
S = "ADOBECODEBANC",
-> (A,0), (B,3), (C,6), (B,9), (A,10),(C,12)
T = "ABC"
-> (A->1, B->1, C->1)

"ADOBECODEBANC"
A,0  B,3  C,6 CHEKOK  L=0 R=6
A,0  B,9  C 6 CUR=9 > R-L
A,10 B,9  C,6 CUR=4 UPDATE  L=6, R=10
A,10 B,9  C,12 CUR = 3 UPDATE L=9 R=12

RES = S.SUBSTRING(L,R+1)
```

For more information, you can refer to [LeetCode's  solution](https://leetcode.com/problems/minimum-window-substring/solution/)

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-10-18
Time | 436 ms
Memory | 54.9 MB
