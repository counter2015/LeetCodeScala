#  Letter Combinations of a Phone Number

## Problem link
https://leetcode.com/problems/letter-combinations-of-a-phone-number/

## Description
Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

![img](http://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png)


## Example


```
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
```
**Note:**

Although the above answer is in lexicographical order, your answer could be in any order you want.

## Solution
Convert each digit to string, and use DFS to generate result.


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-16
Time | 240	ms
Memory | 44.8 MB


