# Container With Most Water

## Problem link
https://leetcode.com/problems/container-with-most-water/


## Description
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.

 
## Example

Input: [1,8,6,2,5,4,8,3,7]
Output: 49

## Solution
It's easy to get the brute force solution.
Just iterate the `height` array with index i and j where i < j.
result = max(result, (j - i) * min(height(i), height(j)))

This solution cost O(n^2) time.

Another way is to use to pointer left and right.
Suppose left initial value = 0, right initial value = height.length - 1
and height(left) <= height(right).

It easy to find that when we use the left wood as part of container, the volume can't be larger since 
the bottom length is already the maximum value, so adjusting the position of the right side can only make the capacity smaller.

In other words, we don't need to consider n * (n-1) combination results of (i, j), just adjust left and right until they're equal.

This solution cost O(n) time.

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-13
Time | 	324 ms
Memory |  50 MB