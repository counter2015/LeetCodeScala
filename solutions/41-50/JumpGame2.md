# Jump Game II

## Problem link
https://leetcode.com/problems/jump-game-ii/

## Description
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Note:

You can assume that you can always reach the last index.


## Example
Input: [2,3,1,1,4]

Output: 2

Explanation: The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.
    


## Solution

We should save three variable, 
- ans, the minimum number of jumps
- last, no more than `ans` steps, the rightest position can reach
- cur, inner state to save rightest position now can reach

Each jump, renew cur as `cur =  max(cur, i + num[i])`

Once now index > last, renew `last = cur, ans += 1`, it just like we are mark each position with number of jumps we can reach.


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-17
Time | 320 ms
Memory | 50.8 MB	


