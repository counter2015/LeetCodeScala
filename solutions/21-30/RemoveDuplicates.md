# Remove Duplicates from Sorted Array

## Problem link
https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Description
Given a sorted array *nums*, remove the duplicates [**in-place**](https://en.wikipedia.org/wiki/In-place_algorithm) 
such that each element appear only *once* and return the new length.

Do not allocate extra space for another array, you must do this by **modifying the input array in-place** with O(1) extra memory
**Note:**

- Only constant extra memory is allowed.
- You may not alter the values in the list's nodes, only nodes itself may be changed.

**Clarification:**

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by **reference**, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

```
// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
```



## Example

**Example 1:**

```
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
```

**Example 2:**

```
Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
```



## Solution
Just implement it :P. 
**I really dont like this problem**, so I will never implement it as it says.
For scala programming language, mutable is evil, let alone to modify input parameter.

> Functional programming languages often discourage or don't support explicit in-place algorithms that overwrite data, since this is a type of side effect; instead, they only allow new data to be constructed. However, good functional language compilers will often recognize when an object very similar to an existing one is created and then the old one thrown away, and will optimize this into a simple mutation "under-the-hood".
According to [wikipedia](https://en.wikipedia.org/wiki/In-place_algorithm)

This kind of problem is not help to improve coding skill and any kind of algorithms knowledge





## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-28
Time | 	1044 ms
Memory | 61 MB	