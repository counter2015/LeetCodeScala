# Linked List Cycle II

## Problem link
https://leetcode.com/problems/linked-list-cycle-ii/

## Description
Given a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

To represent a cycle in the given linked list, we use an integer `pos` which represents 
the position (0-indexed) in the linked list where tail connects to. 
If `pos` is `-1`, then there is no cycle in the linked list.

**Note:** Do not modify the linked list.

**Follow-up**:
Can you solve it without using extra space?

## Example

**Example 1:**

```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```

![img](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png)

**Example 2:**

```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```

![img](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png)

**Example 3:**

```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
```

![img](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png)

## Solution

![](https://counter2015.com/picture/cycle-list.jpg)

Suppose we have a list node which head is `O`, the entrance of the cycle is `A`.

And we set to pointer —— slow and fast, the slow one step by one, the fast one step by two.

And them meet at point `B`.

Let's say 
|OA| = a 
|AB| = b
|BA| = c

the fast distance `f` equals `a + b + k(b+c)`
the slow distance `s` equals `a + b`
and `f = 2s`
so we can get `a + b = k(b+c)`

Then we can find that from `B`, we step `a` distance, we will return `A`

## Run Time Info

\- | \-
------------ | -------------
Date | 2020-08-17
Time | 516 ms
Memory | 50.9 MB
