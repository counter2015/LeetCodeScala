# Valid Parentheses

## Problem link
https://leetcode.com/problems/valid-parentheses/

## Description
Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.


## Example

**Example 1:**

```
Input: "()"
Output: true
```

**Example 2:**

```
Input: "()[]{}"
Output: true
```

**Example 3:**

```
Input: "(]"
Output: false
```

**Example 4:**

```
Input: "([)]"
Output: false
```

**Example 5:**

```
Input: "{[]}"
Output: true
```


## Solution

We can find that, when iterate the input string, once we get a right bracket(that's to say ")]}"),
then should to check former character corresponding left parentheses.

If check failed, return false, else drop the last parentheses of the stack.

When we finish iteration, if the stack size is zero, the input string is valid parentheses,vice versa. 



## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-19
Time | 	 252ms
Memory |  49.1MB	