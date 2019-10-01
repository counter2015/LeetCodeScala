# Permutation Sequence

## Problem link
https://leetcode.com/problems/permutation-sequence/

## Description
The set [1,2,3,...,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

Note:

Given n will be between 1 and 9 inclusive.
Given k will be between 1 and n! inclusive.
## Example

**Example 1:**

```
Input: n = 3, k = 3
Output: "213"
```
**Example 2:**
```
Input: n = 4, k = 9
Output: "2314"
```
    


## Solution
Consider the second example. `n = 4, k = 9`
`(n-1)! = 3! = 6` => it means cost 6 number to let first number "carry in"
and `k/6 = 1, k%6 = 3` => it means the first number get one "carry in", say it's "2"

`res = 2 [?, ?, ?]` and remain list : `[1, 3, 4]`, the problem now is converted to get the 
3th number in `[1, 3, 4]` permutations. This is obviously a recursive problem where `k = 3, n = 3, list = [1,3,4]`

But when does this recursive problem reach the termination condition?
Well, it's easy to find that when k % (n-1)! == 0, the problem should terminate.

In this example , when 
`res = [2, 3] [?, ?]`, `k/1! = 1, k%1=0`, `remain list = [1, 4]`

when k % (n-1) == 0, let's say `a = k/(n-1)! = 1`, it can be convert to 
```
list = list contact remain[a-1], list = [2, 3] contact remain list[0] = [2, 3, 1]
remain list = remain list remove element[a-1], remain list = [4]
result list = list contact reverse(remain list), [2, 3, 1, 4] 
```

Just implement it.


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-10-01
Time | 260 ms
Memory | 40.8 MB	


