# First Missing Positive

## Problem link
https://leetcode.com/problems/trapping-rain-water/

## Description
Given *n* non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

![img](https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png)
The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 
 In this case, 6 units of rain water (blue section) are being trapped.


**Note:**

Your algorithm should run in *O*(*n*) time and uses constant extra space.

## Example

```
Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```



## Solution
For each cell, the water volume `v` = min(leftMostHighWall, rightMostHighWall) - cellHeight
Just implement it. 


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-11
Time | 280 ms
Memory | 48.8 MB	