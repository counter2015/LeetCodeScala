# Combination Sum

## Problem link
https://leetcode.com/problems/combination-sum/

## Description
Given a **set** of candidate numbers (`candidates`) **(without duplicates)** and a target number (`target`), 
find all unique combinations in `candidates` where the candidate numbers sums to `target`.

The **same** repeated number may be chosen from `candidates` unlimited number of times.

**Note:**

- All numbers (including `target`) will be positive integers.
- The solution set must not contain duplicate combinations.

## Example
**Example 1:**

```
Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
```

**Example 2:**

```
Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
```




## Solution
Let's take `candidates = [2,3,5], target = 8` as example.

head of candidates is 2, the solution can be divide into two part, 
one contains 2, the other doesn't contains 2

so 
`f(candidates, target) = f(candidates.tail, target) ∪ (candidates.head,f(candidates, target-candidates.head))` 


Edge situation
- when candidates or target is negative, return null result 
- when target is 0, return the current result.

Just implement it.

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-10
Time | 344 ms
Memory | 56.2 MB	