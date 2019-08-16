# Reverse Integer

## Problem link
https://leetcode.com/problems/reverse-integer/

## Description 

Given a 32-bit signed integer, reverse digits of an integer.

Note: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer 
range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## Example

**Example 1:**

Input: 123
Output: 321

**Example 2:**

Input: -123
Output: -321

**Example 3:**

Input: 120
Output: 21

## Solution

Use `long` and `String` type to store median result.

- read Int, get its sign.
- convert Int to String and reverse
- filter noDigit character and convert to Long `result`
- if the value overflow Integer, return 0, else return sign * result 

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-09
Time | 	228 ms
Memory |  40.4 MB	

