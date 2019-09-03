# Longest Valid Parentheses

## Problem link
https://leetcode.com/problems/longest-valid-parentheses/

## Description
Given a string containing just the characters `'('` and `')'`, find the length of the longest valid (well-formed) parentheses substring.

## Example
**Example 1:**

```
Input: "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()"
```

**Example 2:**

```
Input: ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()"
```

## Solution
If sequence A and B are valid, then AB is also valid.
Each sub longest valid sequence is split by no-valid sequence.

So, we can just mark all valid position and iterate form head find
the longest continuous valid sequence.

 
  
    
## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-03
Time | 276 ms
Memory | 49.2 MB	